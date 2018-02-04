# Pakete

Um die vielen Klassen zu oraganisiern platziert Java Klassen in Paketen (packages).

Java Packages sind hierarchisch organisiert. Wenn die paketnamen mit **java** starten 
so sind sie Teil des JDK oder JRE. Wenn sie mit einem anderen Namen starten, verraten sie
uns woher sie kommen, z.B.

    com.amazon.java8book
Die Regel für package Namen sind dieselben wie für Variablen Namen. 
Meistens bestehen sie aus Buchstaben und Nummern verbunden über Punkte.


## Wildcards
Klassen im selben Package werden oftmals zusammen importiert, so

    import java.util.*;
    
Der Asteriks * ist das Wildcard Zeichen.
Obige Zeile import java.util.Random und einige andere Klassen. Es werden aber nur
Klassen geladen. Child packages, fields oder Methoden werden **nicht** geladen.

Imports über Wildcards zu regeln führt zu kürzeren und übersichtlichen Importlisten,
kann aber auch Verwirrung über was den nun genau Importiert wurde führen.

## Redundante Importe
Es gibt ein spezielles Package in der Java Welt

    java.lang
    
Es wird in jedem Programm automatisch importiert und muss nicht explizit angegeben werden.
Darum funktioniert auch der

    System.out.println();
    
ohne Import Statements.

Werden andere Klassen im selben Pakte importiert, so sind sie ebenfalls redundant. 
Java schaut automatisch im aktuellen Package für andere Klassen.

Einige **Import Regeln**
Im Falle, dass wir Files und Paths importieren möchten: 

    import java.nio.file.*;         // gut, alle Klassen aus file werden geladend
    import java.nio.file.Files;     // gut, Klasse explizit importiert
    import java.nio.file.Paths;     // gut, Klasse explizit importiert
    
    import java.nio.*;              // Nicht gut, wildcard passt nur auf Klassen, nicht
                                    // aber auf "file.Files"
                                    
    import java.nio.file.Paths.*;   // Nicht gut, Methoden können keine importiert werden, 
                                    // sondern nur klassen 
    
## Naming Konflikte
Ein weiterer Grund für Pakete ist, dass die Klassennamen nicht einzigartig in 
der gesamten Java Welt sein müssen.

Welche Klassen können im nächsten Beispiel importiert werden?

    pubic class Conflicts {
        Date date;
    }    
    
Die Antwort lautet:
    
    import java.util.Date;
    
oder

    import java.sql.Date
    
    
Aber vorsicht, folgender Code compiliert nicht

    import java.util.*;
    import java.sql.*;      // does not compile
    
 mit folgender Fehlermeldung
 
    Error:(7, 5) java: reference to Date is ambiguous
        both class java.sql.Date in java.sql and class java.util.Date in java.util match
    
    
mit folgendem Import lösen wir das Problem, und wir verwenden die java.util.Date Klasse.

    import java.util.Date;
    import java.sql.*;
       
    public class DateKonflikt {
        Date date;
    }
    
Was aber, wenn wir beide Klassen explizit brauchen?

    import java.util.Date;
    import java.util.Date;
    
    public class ZweiDate {
        Date javaDate;
    }
    
In diesem Beispiel wird das java.util.Date verwendet.

Brauchen wir wirklich einmal die beiden unterschiedlichen Date, so können wir uns so behelfen.

    public class VerwendungVon2Dates2 {
        java.util.Date javaDate;
        java.sql.Date sqlDate;
    }
    
Ohne import Angaben dafür direkt die Klassenangabe. Oder

    import java.util.Date;
    
    public class VerwendungVon2Dates {
        Date javaDate;
        java.sql.Date sqlDate;
    }

Mit Date als Default Datum und java.sql.Date ohne import Statemen, dafür im Code direkt verwendet.

## Eigene Pakete erstellen
Jede Zeile Code, die bis jetzt geschrieben wurde, wurde im _default package_ erstellt.
Das ist eine spezielles, unbenanntes Paket und soll nur für Wegwerf- und Beispiel Code verwendet
werden.


Für neue Pakete ist die Verzeichnis Struktur auf dem Computer verbunden mit den Paketnamen.

Angenommen wir haben diese beiden Klassen
/tmp/packagea/ClassA.java

    package package;
    public class ClassA {
    }
    
und /tmp/packageb/ClassB.java

    package packageb;
    import packagea.ClassA;
    public class ClassB {
        public static void main(String[] args) {
            ClassA a;
            System.out.println("Got it");
        }
    }
            
            
Kompilieren wir aus dem Verzeichnis /tmp mit folgenden Aufrufen

    $ javac packagea/ClassA packageb/ClassB
    
Wenn alles erfolgreich kompliert ist so kann folgender Aufruf gemacht werden:

    $ java packagea.ClassA
    


Und obwohl wir im /tmp keine komplierten Klassen liegen haben, findet java die 
entsprechenden Klassen und führt aus:

    $ java packagea.ClassA
    Got it
    


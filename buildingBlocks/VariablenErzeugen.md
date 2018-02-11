# Deklarieren und Initialisieren von Variablen

    String zooName;
    int anzahlTiere;
    
    zooName = "Walter Zoo";
    anzahlTiere = 456;
    
    
oder direkt
    
    String zooName = "Walter Zoo";
    anzahlTiere = 456;
    
Mehrere Variablen auf einer Zeile deklarieren ist möglich.

    String s1, s2;
    String s3 = "yes", s4 = "no";
    int i1, i2, i3 = 3;     // nur i3 wurde auch initialisiert mit 3
    
    int zahl, String wert;  // kompiliert nicht
   
Weitere Beispiele

    1: boolean b1, b2;
    2: String s1 = "1", s2;
    3: double d1, double d2;   // kompiliert nicht, mehr als ein Typ pro Zeile 
    4: int i; int i2;          // ok, ; beendet eine Statement - kann aber auf derselben Zeile stehen
    5: int i3; i4;             // kompliert nicht

Zeile 3 kompiliert nicht, weil Java keine 2 Typen auf einer Zeile ohne Statement Abschluss (;) zulässt.
Zeile 4 kompiliert, weil nach jeder Deklaration, das Statement mit einer Zeile abgeschlossen werden

## Identifiers
Java hat präzise Regeln wie Identifier benannt werden dürfen.
3 Regeln dazu

* Der Name muss mit einem **Buchstaben**, einem **$** Symbol oder einem **_** beginnen.
* Nachfolgende Zeichen dürfen auch zahlen sein
* Es dürfen keine reservierte Wörter aus Java verwendet werden.

    okidentifier
    $OK2Identifiert
    _alsoOkIdentfiert
    __$StillOkIdentifier

nicht ok

    3DPointer           // darf nicht mit einer Zahl beginnen
    holliywood@vine     // @ in einer Variable nicht erlaubt
    *$coffee            // * nicht erlaubt
    public              // ist ein reserviertes Wort
    Ωvalid;
    String ßvalid;
    String ƒ∂å;         // nicht valid - å nicht erlaubt
    
Java erlaubt unicdoe charakter set und damit gibt es über 45'000 mögliche Zeichen für 
einen Variablen Namen zu benennen.

## Intialisierung von Variablen
### Lokale Variablen
Eine lokale Variable wird innerhalb einer Methode definiert und muss vor dem Verwenden initalisiert werden.
Sie haben keinen Default Wert und der Kompiler schmeisst einen Fehler beim Missachten dieser Regel
    
    public int kompiliertNicht() {
        int y = 10;
        int x;              // x ist nicht initialsiert
        int reply = x + y;
        return reply; 
    }
    
das funktioniert hingegen
    
    public int kompiliert() {
        int y = 10;
        int x;                  // x wird deklariert
        x = 3;                  // x wird initialsiert vor dem Verwenden
        int reply = x + y;      // x wird hier verwendet
        return reply; 
    }
    
    

## Instanz und Klassen Variablen
Eine Variable wird als Klassen Variable bezeichnet, wenn das Schlüsselwort **static** zur Deklarierung
vewendet wird. Instanz und Klassen Variablen erfordern nicht, dass sie initalisiert werden.
Sobald diese Variablen deklariert werden, vekommen sie default Werte zugeordnet

Variablen Typ | Default Initialisierungwert
------------- | ---------------------------
boolean | false
byte, short, int, long | 0 (int the type's bit length)
float, double | 0.0 ( in the type's bit length)
char | '\u0000' (NUL)
Alle Objekt-Referencen (alles andere ) | null


## Der Scope von Variablen verstehen

Methoden Paramter werden ebenfalls zu den lokalen Variablen gezählt

    public void iss(int piecesOfCheese) {
        int bitesOfCheese = 1
    }
    
Wenn du ein Set von diesen Klammern siehst ({ }), dann bedeutet dies, dass du in einen
neuen Block eingetreten bist.

Obwohl hier nur wenig aufgeschrieben ist, ist das Verständnis von Variablen Scope sehr wichtig!

Hier noch eine Regeln on Scope
* Lokale Variablen - im Scope von der Deklaration bis zum Ende des Blocks
* Instanz Variablen - im Scope von der Deklaration bis zur Garbage Collection des Objekts
* Klassen Variablen (mit **static** deklariert) - im Scope von der Deklaration bis zum Ende des Programms
        
## Die Reihenfolde von Element innerhalb einer Klasse
Kommentare können irgendwo innerhalb einer Klasse angebracht werden.

Ansonsten gelten folden Regeln:

Element | Beispiel | Erforderlich | Wo ist das Element zu platzieren
------- | -------- | ------------ | ---------------------------------
Paket Deklaration | ch.wesr.prepareforjava; | nein | In der ersten Linie
Import Statements | import java.util.*; | nein | unmittelbar nach der package Deklaration
Klassen Deklaration | public class Animal | ja | unmittelbar nach der Import Deklaration
Felder Deklarationen | int value; | nein | Irgendwo in der Klasse
Methoden Deklarationen | void method() | nein | Irgndwo in der Klasse


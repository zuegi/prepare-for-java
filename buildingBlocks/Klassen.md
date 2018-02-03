# Klassen versus Files

In den meisten Fällen wird in Java eine Klasse in ihrem eigenen File erstellt.
z.B. Animal.java

    public class Animal {
        String name; 
    }

Meistens wird diese Klasse als Public deklariert, was bedeutet das irgend 
eine Code Stelle diese Klasse Animal aufrufen kann.

Interessanterweise verlangt aber Java nicht, dass eine Klasse als **public** deklariert wird.

Zum Beispiel funktioniert auch diese Klasse so:

    class Animal {
        String name; 
    }
    
    
Es ist sogar möglich 2 Klassen in einem File unterzubringen.

    class Animal {
        String name; 
    }
    class Animal2 {
        
    }
    
    
Es ist sogar möglich eine Klasse als NichtAnimal3.java zu benennen, aber die Klassendeklaration
selber als Animal3 zu schreiben.

NichtAnimal3.java -> public class Animal3 {}

    class Animal3 {
     
    }

Wenn man aber eine **Klasse** als **public** deklariert, so muss auch der **Filename**
so benannt werden.

 Animal.java -> public class Animal {}
 
    public class Animal {
        String name; 
    }
    class Animal2 {
        
    }


# Main Methode
Die main() Methode ist das Tor zwischen dem Startup des Java Prozesses und dem Beginn des Codes.
Jeder legale Java Code kann in eine maint() Methode geschrieben werden.

Die main() Signatur 

    public static void main(String[] args) {}
    --
    public      access modifier
    static      bindet eine Methode an die Klasse, der Aufruf kann mit Klasse.main() erfolgen.
    void        representiert den Return Type, es ist eine gute Praxis Methoden als void zu deklairen
                welche den Objekt Status verändern. Die main() Methode verändert den Status des Programms
                deshalb wird sie als void deklariert. 
    
    
    
Die Parameter Liste der main() Methode -> String[] args

Folgende Kombinationen sind möglich als Parameter Liste zu übergeben und repräsentieren einen Array.

    ```java
    public static void main(String[] args) {}
    public static void main(String args[]) {}
    public static void main(String..args) {}
    
Werden zu wenige Argumente übergeben so resultiert das in einer ArrayIndexOutOfBoundsException

    public class Animal4() {
        
        public static void main(String...args){
            System.out.println(args[0]);
            System.out.println(args[1]);
            // das dritte Argument fehlt 
        } 
    }
    
    $ java Animal Eins 
    Eins
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
    	at ch.wesr.prepareforjava.buildingBlocks.klassen.Animal4.main(Animal4.java:7)

**Zuviele** Argument werden aber einfach **ignoriert**!

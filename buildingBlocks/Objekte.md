# Erzeugen von Objekten
Ein Objekt ist eine Instanz einer Klasse.

## Konstruktoren
Um eine Klasse zu erzeugen schreiben wir Code wie diesen

    Random random = new Random();
    
Als erstes deklarieren wir den Typ (Random) und geben der Variablen einen Namen (random).
Diese Variable wird in Java verwendet um die Referenz auf das Objet (new Random())zu speichern.

Random() schaut auf den ersten Blick wie eine Methode aus. Es ist aber ein Konstruktor, 
eine spezielle Art einer Methode, welche ein Objet erzeugt.

**Regeln für einen Konstruktor in Java**
* Der Konstruktur heisst immer so wie die Klasse.
* Der Konstruktor hat keinen Return Type ( auch **keine void** Deklaration)


    public class Chick(){
        public Chick(){
            System.out.println("Das ist ein Konstruktor");
        }
    }

Aber in den Examen wird immer mal gerne solchen Code präsentiert:

    public void Chick() {}  // Das ist kein Konstruktor, weil return type definiert.
    

Für viele Klassen braucht es aber auch gar keinen Konstruktor, weil der Compiler
einen Default Konstruktor zur Verfügung stellt.

## Lesen und Schreiben 
Es ist möglich Instanz Variablen direct aus der aufrufenden Klasse lesen und schreiben
zu können.

    public class Swan {
    
        int numberEggs;     // instanz variable
    
        public static void main(String[] args) {
            Swan mother = new Swan();
            mother.numberEggs = 2;      // setze die Variable
    
            System.out.println("Der Schwan hat " + mother.numberEggs);
        }
        
        
Man kann sogar Felder lese und schreiben direkt nach dem deklarieren

    public class Name {
        static String first = "René";
        static String last = "Weishaupt";
        static String full = first +" " +last;
    
        public static void main(String[] args) {
            System.out.println("Hallo " +full);
        }
    }
   
## Instance Initializer Blocks
Der Code zwischen den geschweiften Klammern {} wird als **code block** bezeichnet.

    public static void main(String[] args) {
        { System.out.println("Feathers");}
    }
    
    { System.out.println("Snowy"); }
    
Wieviele code blocks erkennt man im obigen Beispiel?
**3** ist die Antwort. Warum? Man zählt ganz einfach die Paare der {} Klammern.

## Reihenfolge der Initialisierung
Wenn wir Code schreiben, welcher an verschiedenen Orten Felder initialisiert, dann müssen
wir auf die Reihenfolge der Initialiszierung aufpassen.
Obwohl es noch mehr Regeln zu beachten gilt, nehmen wir 2 Regeln auf:

**Regeln**
* Felder und Instanz Initialisierer (was für ein Wort) Bocks werden in der Reihenfolge,
wie sie in der Klasse / File geschrieben werden berücksichtigt.
* Der Konstruktor wird nachdem alle Felder und Instanz Initialisierer Blocks durchgelaufen
sind aufgerufen.

Folgendes Beispiel soll das veranschaulichen

    public class Chick {
        
        private String name = "Fluffy";
        { System.out.println("setting field"); }
        public Chick() {
            name = "Tiny";
            System.out.println("setting constructor");
        }
    
        public static void main(String[] args) {
            Chick chick = new Chick();
            System.out.println(chick.name);
        }
    }
    
Zuerst wird die maim() Methode aufgerufen (da startet Java immer) und dann wird
der Konstruktor Chick aufgerufen durch das new Chick() Statement.
Damit wird das Objekt initalisiert und der Variablen name Fluffy zugewiesen. Danach
wird das Statement setting field im Instanz Initialisierer geprintet.
Wenn das alles gemacht ist, kehrt Java zum Konstruktor zurück, setzt Tiny in die name 
Variable und printet setting constructor.
Wieder in der main() wird die Variable chick.name angezeigt. Der Output sieht so aus:

    setting field
    setting constructor
    Tiny
    
Die Reihenfolge spielt eine grosse Rolle, das z.b. funktioniert nicht

    { System.out.println(name); }       // kompiliert nicht
    private String name = "Fluffy";
    

## Zurück zu Building Blocks
[Building Blocks](BuildingBlocks.md)    

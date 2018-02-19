# Zusätzliche binäre Operatoren

## Zuweisungsoperatoren (Assignment Operators)
Der Zuweisungsoperator **=** weist oder modifziert den Wert einer Variablen

    int x = 1;
    
Weist der Variablen x den Wert 1 zu.

Java befördert den Typ eines kleinen Datentyps automatisch zu einem grösseren. So z.b

    short a = Short.MAX_VALUE;
    int b = 1;
    int c = a +b;


Aber vorsicht - das funktioniert nicht. Warum?

    short x = Short.MAX_VALUE;
    x = x +1;
    Error:(7, 14) java: incompatible types: possible lossy conversion from int to short
    
x hat den Maximum Wert des Typs short erreicht und kann nicht erweitert werden.

Weitere Beispiele

    int x = 1.0;        // kompiliert nicht, weil Kommastelle
    short y = 1921222;  // kompiliert nicht, Literal > Short.MAX_VALUE(=32767)
    int z = 9.1234f;         // kompiliert nicht, Floating Typ
    
    
### Casting primitve values
Wir können die Beispiele der vorherigen Beispiel fixen, und zwar durch casting. 
Aber vorsicht grössere Typen in kleiner Typen zu casten, kann böse Überraschungen hervor rufen.

    int x = (int) 1.0;  
    short y = (short) 1921222;  // Gespeichert als 20678
    int z = (int) 9.1234f;      // Gespeichert als 9

**Overflow** und **Underflow** sind 2 Begriffe aus den obigen Beispielen.
Ist eine Zahl zu gross um in einem Datentyp gespeichert zu werden, so kann sie mittels **cast**
in den Datentyp gespeichert werden, allerdings mit einem Nachteil. Über den cast wird 
ein nummerischer Overflow ausgelöst. Overflow bedeutet, wenn eine Zahl zu gross ist um in den
angegeben Datentyp zu speichern, dann versucht das System die Zahl in den nächstkleineren Wert zu
wechseln und zählt dann von dort.

    short x = 3;
    short y = 10;
    short z =  x * y;       // kompiliert nicht - short wird zu int promoted (befördert)
    
    
Man kann aber den Compiler zwingen einen short daraus zu machen.


    short x 3;
    short y = 10;
    short z = (short) x * y;
    

## Zusammengesetzte Zuweisungsoperatoren (Compound assignment operators)
Neben dem einfachen Zuweisungsoperator **=** gibt es noch eine weiter Anzahl zusammengesetzter
Zuweisungsoperatoren. Dabei sind für das OCA Examen nur **+=** und **-=** zu kennen.

    int x =2, z = 3;
    x = x * z;       // einfacher Zuweisungsoperator (=)
    x *= z;         // zusammengesetzter Zuweisungsoperator (*=)
    
Die linke Seite eines zusammengesetzten Operators (x) kann nur definiert werden, 
wenn sie schon vorher definiert wurde (x=2) und kann nicht zur Deklarierung einer neuen Variablen verwendet werden.

Zusammengesetzte Operatoren sind nicht nur einfach Abkürzungen, sondern reduzieren ein explites Casten.

    long x = 10;
    int y = 5;
    // y = y * x;       // kompiliert nicht
    y = (int) (y * x);  // kompiliert, es gibt aber noch einen anderen Weg
    
Es gibt noch einen anderen Weg die obige letzte Zeile mit einem expliziten cast zu schreiben.

    long x = 10;
    int y = 5;
    y *= x;
    
Der zusammengesetzte Operator casted y zuerst zu einem **long** type um die **Multiplikation** auszuführen
und danach wird das Resultat in ein **int** Typ casted.

Eine abschliessende Bemerkung zu den Zuweisungsoperatoren. 
Das Ergebnis einer Zuweisung ist ein Ausdruck an und für sich. Sieh dir folgendes Beispiel an:

    long x = 5;
    long y = (x=3);
    System.out.println("x: " +x);       // output 3 
    System.out.println("y: " +y);       // output ebenfalls 3

In obigem Beispiel werden 2 Dinge erledigt. Zuerst wird der x die 3 zugewiesen und gibt danach
den Wert (3) der Zuweisung an y zurück.
Im Examen werden gerne solche Zuweisung in mitten einer Expression gemacht.

## Relationale Operatoren
Relationale Operatoren vergleichen 2 Expressions und geben dann einen boolean Wert zurück.
Die folgenden relationalen Operatoren sind nur für nummerische primitven Datentypen zugelassen.

Operator | Auswirkung
-------- | ----------
**<** | strikt kleiner
**<=** | kleiner oder gleicht
**>** | strikt grösser
**>=** | grösser oder gleich

    System.out.println(x < y);      // true
    System.out.println(x <= y);     // true
    System.out.println(x >= z);     // true
    System.out.println(x > z);      // false

Der 5. relationale Operator ist der **instanceof** Operator. Er wird auf Objekt Referenzen 
und Klassen oder Interfaces angewendet.

    String a = "a";
    System.out.println(a instanceof String);
    
Der instanceof Operator ist **out of scope im OCA Examen**.


## Logische Operatoren 
Logische Operator (**^**), (**&**) und (**|**) können sowohl auf nummerische als auch boolean Werte
angewendet werden.

Wenn sie auf boolean Werte angewendet werden, dann bezeichnet man sie als **logical** Opertoren.
Wenn sie auf nummerische Werte angewendet werden, so nennt man sie **bitwise** Operatoren, weil
sie bit um bit den Vergleich der Werte anstellen.

Hier sind einige Regeln 
* AND (&) ist nur _true_, wenn beide Operanden true sind
* Inclusives OR (|) ist nur false, wenn beide Operanden false sind.
* Exclusives OR (^) ist nur true, wenn beide Opereanden unterschiedlich sind.

Daraus lässt sich eine Tabell ableiten

### x & y
 o | y = true | y = false
---| -------- | ---------
x = true | true | false
x = false | false | true

### x | or
o | y = true | y = false
---| -------- | ---------
x = true | true | true
x = false | true | false

### x ^ or
o | y = true | y = false
---| -------- | ---------
x = true | false | true
x = false | true | false

### Die bedingten Operator
**&&**, und **||** werden als _conditional operators_ bezeichnet (oder als short-circuit operator).
Die beiden Operatoren sind ziemlich ähnlich den _&_ und _|_ - allerdings mit einem Unterschied.

    boolean x = true || (y > 4);
    
Die rechte Expression (y > 4) muss nicht ausgewertet werden, wenn die linke Seite (true) der Expression,
schon true ist. Oder anders ausgedrückt, _x_ kann nur false sein, wenn beide Operanden false sind.

    if( x != null && x.getValue() < 5) {
        // Mach etwas
    }

In obigem Beispiel wird x auf der rechten Seite nur ausgewertet, wenn es nicht einen null Wert besitzt,
und das schützt vor einer NullPointerException.

Anders das Beispiel

    if( x != null & x.getValue() < 5) { // Wirft eine Exception wenn x null ist.
            // Mach etwas
        }

hier werden beide Seiten des Operators ausgewertet und wenn x null ist, dann gibt es eine
NullPointerException.

Im Examen werden oftmals solche Fragen gestellt: Was ist der Wert von X?

    int x = 6;
    boolean y = (x >= 6) || (x++ <= 7);
    System.out.println(x);
    
    
Resultat **6**. weil x >= 6 true ist, wird die rechte Seite des Operators nie ausgewertet.

### Der Equality Operator
In Java unterscheidet man eine semantische Differenz zwischen **2 Objekte sind gleich** und
**2 Objekte sind gleichwertig**. Und es ist noch komplizierter, weil man bei den primitiven und
boolean Typen diese Unterscheidung nicht machen kann.

Die beiden Operatoren **==** und **!=** vergleichen 2 Operanden und bringen als Resultat ein boolean
zurück. Der **==** Operator wird in 3 Szenarien verwendet:

* Vergleichen von nummerischen Werten


    int x = 5;
    double y = 5.00;
    
    if( x == y ) {          // korrekt, x wird in ein double befördert (promoted)
        // Mach etwas
     } 
     
* Vergleichen von boolean Werten


    boolean x = true;
    boolean y = false;
    
    if(x == y ) {
        // Mach etwas
     }
    
    
* Vergleichen von 2 Objekten, inklusive null und String Werte


    Random r = null;
    
    if(r == null) {
        System.out.println("hoho, r wurde noch nicht initalisiert und hat einen null Wert");
    }
    
    
siehe auch [Vergleiche.java](src/main/java/ch/wesr/prepareforjava/operators/Vergleiche.java)

Aber Vorsicht bei Referenzen:

    File x = new File("meinText.txt");
    File y = new File("meinText.txt");
    File z = y;
    System.out.println( x == y);    // false
    System.out.println(y == z);     // true 
 


## Zurück zu Operators and Statements
[Operators and Statements](OperatorsAndStatements.md) 
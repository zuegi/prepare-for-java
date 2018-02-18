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
 - | y = true | y = false
-- | -------- | ---------
x = true | true | false
x = false | false | true



## Zurück zu Operators and Statements
[Operators and Statements](OperatorsAndStatements.md) 
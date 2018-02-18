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

## Relationale Operatoren

## Logische Operatoren 




## Zurück zu Operators and Statements
[Operators and Statements](OperatorsAndStatements.md) 
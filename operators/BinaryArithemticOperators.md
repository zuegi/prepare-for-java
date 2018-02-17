# Binary Arithemic Operators

## Arithemtic Operators
Arithmetische Operatoren werden mit folgenden Symbolen durchgeführt:
* **+**  (Addition)
* **-**  (Subtraktion)
* __*__  (Multiplikation)
* **/**  (Division)
* **%**  (Modulus)
* **++**  (Post-unary)
* **--**  (Pre-unary)

### Punkt kommt vor Strich Regel
Die multiplizerenden Operatoren (*, /, %) stehen in der Rangordnung höher als die additiven Operatoren (+, -)
Ein Ausdruck wie folgender

    int x = 2 * 5 + 3 * 4 - 8;
    
wird zuerst als 2 * 5 und als 3 * 4 ausgewertet und danach die additiven Operatoren angewendet, was 
folgende Reduktion ausdrückt
    int x = 10 + 12 - 8;
    
Resultat: **14**.

Die _Punkt kommt vor Strich_ Regel kann aber mit Klammern übersteuert werden.
Siehe dazu folgendes Beispiel:

    int x = 2 * ((5 + 3) * 4 - 8);

Zuerst wird die erste innere Klammer ausgewertet
    
    int x = 2 * (8 * 4 - 8);
    
Dann die 2. Klammer und innerhalb der Klammer gilt wieder die _Punkt kommt vor Strich Regel_

    int x = 2 * (32 -8);
    
Und daraus

    int x = 2 * 24;
    
Resultat: **48**

Alle arithemtischen Operatoren könne auf primitive Typen in Java angwendet werden - **ausser** auf
die Typen boolean und String. 
Auf den Typ String können allerdings die Opertoren + und += angewendet werden, welches in 
eine String Concatenation führt.

### Der Modulus Operator
Der Modulus oder _Rest_ Operator ist ein wenig speziell.

    System.out.println( 9/3 );      // Resultat => 3
    System.out.println( 9%3 );      // Resultat => 0 
    
    System.out.println( 10/3 );      // Resultat => 3 
    System.out.println( 10%3 );      // Resultat => 1 
    
    System.out.println( 11/3 );      // Resultat => 3 
    System.out.println( 11%3 );      // Resultat => 2 
    
    System.out.println( 12/3 );      // Resultat => 4 
    System.out.println( 12%3 );      // Resultat => 0 
    
Es gibt eine Regel zum Modulus die lautet:

    Für einen Divisor x in einer Modulus Operation liegen die Resultate immer zwischen 0 und (x -1)
    
Im obigen Beispiel ist der Divisor x und die Resultate liegen also im Range 0, 1, 2, 3.

    
## Zurück zu Operators and Statements
[Operators and Statements](OperatorsAndStatements.md) 
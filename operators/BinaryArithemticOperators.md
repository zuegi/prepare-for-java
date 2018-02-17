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

## Primitive numerische Beförderung??
(primitve numeric promotion)
In Java sind die primitiven Datentypen von unterschiedlicher Grösse, unterscheiden sich in der Bit Anzahl.
Es ist nicht so wichtig die Grösse auswendig zu kennen, aber es ist wichtig zu wissen, welche primitiven
Typen grössere Bit Anzahl ausweisen. Die Bit Anzahl ist die Grösse, welche direkt im Memory aufschlägt.
Also braucht es für eine Variable vom Typ int mehr Speicherplatz, als eine Variable vom Typ short.

Keyword | Type | maximaler Wert | Bespiel
------- |----- |--------------- | -------
boolean | true oder false | - | true
byte | 8-bit integral value | 2^8 | 123
short | 16-bit integral value | 2^16 |  123
int | 32-bit integral value | 2^32 | 123
long | 64-bit integral value | 2^64 | 123
float | 32-bit floating-point value  | tbd | 123.45f
double | 64-bit floating point value | tbd |  123.456
char | 16-bit Unicode value  | - | 'a'

Wenn wir nun arithmetische Operationen auf die Variablen mit unterschiedlichen Typen anwenden, 
so gibt es auf den ersten Blick ein etwas spezielles Verhalten von Java.

Das sind die Regeln:
1. Wenn 2 Werte von verschiedenem Typ sind, so befördert Java **den kleineren** Typ **in den grösseren**
Typ der beiden Werte.
2. Wenn einer der Werte ein **Integral** Typ und der andere ein **Floating** Typ ist, so befördert Java
den Integral Wert automatisch zu einem Floating Typ.
3. Kleinere Datentypen wie **byte**, **short** und **char** werden zuerst **nach int** befördert, 
wenn immer sie in einer binären arithmetischen Operation verwendet werden (unäre Operationen ausgeschlossen),
und zwar auch wenn keiner
der Operanden ein Typ int vorweist.
4. Nach der Berförderung haben alle Operanden denselben Datentyp und so wird auch das Resultat
denselben Datentyp haben.
    
Daraus leiten wir einige Beispiele ab:

    int x = 1;
    long y = 33;

Was ist das Resultat von x * y?

long ist der grössere Typ als int und somit wird x in ein long befördert und das Resultat ist vom Typ long.

Welcher Typ Resultier aus x + y in folgendem Beispiel:

    double x = 39.21;
    float y = 2.1;
    
Achtung das ist ein Fang-Frage -> obiger **Code kompiliert nicht**, weil der float Typ nicht mit
einem abschliessenden f bezeichnet wird.
Wenn der float Typ korrekt gesetzt wird

    double x = 39.21;
    float y = 2.1f;
    
dann wir die Geschicht einfach -> float wird zu einem double befördert und das Resultat wird vom Typ double sein.

Was ist der Wert von x / y?

    short x = 9;
    short y = 3;
    
Nach der regel 3 werden diese beiden Typen zu einem int Typ befördert und denselben Typ wird 
auch das Resultat ausweisen.

Was ist der Typ von x * y / z?

    short x = 14;
    float y = 13;  
    double z = 30;
    
Der Typ short verlangt eine Beförderung nach int (Regel 3). Allerdings ist y ein float sodass
der short Typ von int nach float befördert wird, bevor dann alle zu einem Typ von double gemacht
werden und so wird auch das Resulat mit dem Typ double gespeichert.
    
Anmerkung: Hast du bemerkt, dass die Deklaration von float y =13; kein abschliessendes f ausweist?
Wenn der Wert einer float Variablen nicht mit einer Kommastelle versehen ist, kann das f weggelassen werden.
Allerdings wäre es auch nicht falsch, wenn das f aufgeführt wird.
    
## Zurück zu Operators and Statements
[Operators and Statements](OperatorsAndStatements.md) 
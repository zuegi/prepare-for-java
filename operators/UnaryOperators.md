# Unäre Operatoren
Unäre Operatoren erfordern genau einen Operanden.

Unärer Operator | Beschreibung | Beispiel
--------------- | ------------ | --------
**+** | Weist auf eine positive Zahl oder Expression hin | +1 +x (auch wenn Java sowieso davon ausgeht, dass Zahlen positiv sind)
**-** | Weist auf eine positive Zahl oder Expression hin | -1, -x
**++** | addiert um 1 | _expression_++, ++_expression_
**--** | subrahiert um 1 | _expression_--, --_expression_
**!** | Invertiert den Wert eines boolean | !x

## der logische Komplementär und Negierende Operand
Logical Complement (**!**") und Negation Operators (**-**, **+**)

Beispiele

    int x = 1;
    x = -x;             // -1
    
    double y = 1.21;
    y = -y;             // -1.21
    
    int a = !5;         // Kompiliert nicht
    boolean y = -true;  // Kompiliert nicht!
    
    boolean z = !0;     // Kompiliert nicht!

## Increment und Decrement Operators
Die **+** und **-** Operatoren können auf nummerische Operanden angewendet werden und haben
eine höhere Rangordnung gegenüber binären Operatoren.

++_epression_ | Zuerst wird der Operand hochgezählt und dann die Operationen ausgeführt
_expression_++ | Zuerst werden die Operationen ausgeführt und dann wird der Operand hochgezählt.

    int counter = 0;
    System.out.println(counter);       // 0
    System.out.println(++counter);     // 1
    System.out.println(counter);       // 1 
    System.out.println(counter--);     // 1
    System.out.println(counter);       // 0

So ähnlich wie das folgende Beispiel könnte auch im Examen vorkommen

    int x = 3;
    int y = ++x * 5 / xx-- + --x;
    
    System.out.println(x);       // 0
    System.out.println(y);       // 0
    
Was ist das Resultat?

++x erhöht x auf 4
--x decrement x auf 2
x-- bleibt vorerst auf der 4
Punkt kommt vor Strich

    int y = 4 * 5 / x-- + --x;      (x = 4)
    int y = 20 / 4 + --x;           (x = 4, weil der x-- Operand nach der Operation ausgewertet wird
    int y = 5 + 2;                  (x = 2, obige Zeil setzt x auf 3, --x setzt die 3 vor der Operation auf 2 
    
    x = 2;      // Resultat
    y = 7;      // Resultat
    

## Zurück zu Operators and Statements
[Operators and Statements](OperatorsAndStatements.md) 
# Java Statements

Ein Statement ist eine komplette Ausführungseinheit in Java, welche mit einem **;** terminiert wird.

Ein Control-Statement ist ein Block von Code zwischen zwei geschweiften Klammern (**{** **}**).

## if Statement
Das if Statement wertet nur boolean Ausdrücke aus.

    if(booleanExpression) {
        // branch if true
    } else {
        // branch if false
    }
    
Achtung sie wollen dich austricksen:

    if(hourOfDay < 11)
        System.out.println("Good Morning");
        morningGreetingCount++;
        
Ohne Klammern gehört die morningGreetingCount++ Expression nicht mehr zum if Statement.
Untenstehend das Beispiel mit der Klammer.

    if(hourOfDay < 11) {
        System.out.println("Good Morning");
        morningGreetingCount++;
    }
    
Folgende Code Beispiele kommen öfters vor.

    int x = 5;
    if(x) {             // kompiliert nicht, weil x keine booleanExpression
        // do something
    }
    
    int x = 1;
    if(x = 5) {         // kompiliert nicht, weil x = 5 keine booleanExpression
        // do something
    }
## Ternary Operator ? :

Der Ternary Operator ist der einzige Operator der 3 Operanden ausweist.

    booleanExpression ? expression1 : expression2;
    
Der erste Operand muss ein boolean Ausdruck sein und die beiden anderen Ausdrücke können 
einen Wert zurückgeben.
Eigentlich ist es nicht notwendig dass expression1 und expression2 vom selben Datentyp sind.

Aber es kommt zum Zuge, wenn der ternary Operator mit einem Assignment in Verbindung gebracht wird.

    int x = (y < 91) ? 9 : "Horse";     // kompiliert nicht
    
Ein System.out.println() Statement macht aber keine Unterscheidung zwischen verschiedenen Typen
und dann kann das folgende Statement durchaus funktionieren.

    System.out.println("(y < 5) ? 21: "Zebra";
    

Nur eine der auf der rechten Seite befindlichen Expressions wird bewertet zur Laufzeit.

    int x = 1;
    int z = 1;
    
    final int y = x < 10: x++ : z++;
    System.out.println(x +", " +z);         // Output => 2,1
    
Weil die Auswertung des boolean Ausdrucks _true_ ist, wird nur die **x** Variable hochgezählt.
Im _false_ Fall sieht das dann so aus

    int x = 1;
    int z = 1;
        
    final int y = x >= 10: x++ : z++;
    System.out.println(x +", " +z);         // Output => 1,2


## switch Statement
Ein Switch Sttement ist eine komplexe Entscheidungsstruktur, in welcher einer Variable ausgewertet
wird und dann zum ersten zutreffenden _case_ Statement geführt wird. Gibt es kein zutreffendes 
_case_ Statement, wird ein optionales _default_ Statement aufgerufen.

    switch(variableToTest) {
        case constanExpression1:
            // mach etwas
            break;
        case constantExpression2:
            // mach etwas
            break;
        ...
        default:
            // mach etwas    
            // hier braucht es kein break, weil default am Ende steht
            // aber AUFGEPASST, das default Statement muss nicht am Ende stehen!!! 
            // dann braucht es u.U. ein break Statement gegen unerwünschtes Verhalten
    }
    
### Supported Data Types
Folgende Datentypen sind durch das **switch** Statement unterstützt und müssen **auswendig** gelernt werden:

* byte und Byte
* short und Short
* char und Character
* int und Integer
* String
* enum Values

### compile-time constant values
Die _case_ Statement Werte müsse zur Kompiliert Zeit konstante Werte mit demselben Datentyp wie
das _switch_ Statement Wert sein.
Zudem müssen die _case_ Werte entweder _Literale_, _enum_ Konstanten oder als _final_ deklariert sein.

* zu testende Variable wird ausgewertet
* gibt es ein zutreffendes _case_ Statement, dann wird dieses Statement ausgeführt
** gibt es am Ende des _case_ Statement kein **break** oder **return** so wird das nächst untere Statement ebenfalls ausgeführt.
* gibt es keine zutreffendes _case_ Statement gefunden, dann wird das (optionale) _default_ Statement ausgeführt.

Beispiel

    int tagDerWoche = 5;
    switch(tagDerWoche) {
        case 0:
            System.out.println("Sonntag");
        default:
            System.out.println("Wochentag");
        case 6:
            System.out.println("Samstag");
            break; 
    }

Der output lautet

    Wochentag
    Samstag

Wird im obigen Beispiel der Variablen tagDerWoche = 0; zugewiesen, dann lautet der Output

    Sonntag
    Wochentag
    Samstag
    
Zuerste wird 0 als zutreffendes _case_ Statement gefunden, dann - weil kein break - das
_default_ Statement ausgewertet (was ebenfall kein break vorweist) und zum Schluss der Samstag angezeigt.

Mit tagDerWoche = 6; gibt es folgenden Output

    Samstag
    

## while Statement


    while(booleanExpresion) {
        // mach etwas 
    }

### Infinite (undendliche) Loops (Schleifen)
Achtung

    int x = 2;
    int y = 5
    while( y < 10;) {
        x++; 
    }
    
Diese while endet niemals - erkenne warum.

## do-while Statement

ls

## for statement

## for-eacht statement

##



## Zurück zu Operators and Statements
[Operators and Statements](OperatorsAndStatements.md) 
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

Anders als der while loop, wird beim do-while loop der Statement Block auf jedenfall einmal durchlaufen.

    do {
        // mach etwas
    } while (booleanExpression);
    
Java führt den Statemen Block code zuerst aus und prüft dann die loop Bedingung.
Der Unterschied zwischen dem while loop und do-while loop ist sehr klein.
Java empfiehlt empfiehlt die while Schleife zu verwenden, wenn der Code Block nicht zwingend ausgeführt
werden muss. Wo hingegen der do-while loop empfohlen wird, wenn der Code Block mindestens einmal durchlaufen
werden muss.

## for statement

    for(initialization; boooleanExpression1; updateStatement) {
        // mach etwas
    }
    
Es gibt verschiedene Arten von for loops, welche vor allem im Examen oftmals gefragt werden.

### Infinite loops

    for (; ; ) {
        System.out.print(new Date() + " Unendliche Schleife");
    }
    
Obiges Statement kompiliert und läuft einwandfrei und das obwohl keine Komponenten deklariert sind.
Die Komponenten sind optional, allerdings sind beide **Semikolons** **zwingend nötig**:

    for() {}    // kompiliert nicht
    
    for(;) {}   // kompiliert nicht
    
### Mehrere Bedingungen hinzufügen (adding multiple terms)

    int x = 0;
    for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
        System.out.print(y +" ");
    }
    
* Die Komponenten (initialization, booleanExpression, updateStatments) können zusätzliche Variablen deklarieren
welche nicht mal unbedingt verwendet werden müssen (siehe **z**).
* Variablen wie **x** können auch ausserhalb des for loops definiert werden und dann im loop verwendet werden.


### Erneutes deklarieren eienr Variable im Initialisierungsblock

    int x = 0;
    for(long y = 0, x = 4; x < 5 && y > 10; x++, y++ ) {    // kompiliert nicht
        System.out.println(x +" ");
    }
            
    Error:(15, 25) java: variable x is already defined in method erneutesDeklarieren()

**x** ist im obigen Beipsiel als int deklariert worden und will im Initialsierungsblock nochmals
deklariert werden als Typ long -> das funktioniert nicht.

### Verwenden von inompatiblen Datentypen im Initialisierungsblock

    for(long y = 0, int x = 4; x < 5 && y < 10; x++, y++ ) {    // kompiliert nicht
        System.out.print(x +" ");
    }
    
Im Initialisierungsblock können nicht 2 verschiedene Datentypen (long und int)deklariert werden.

### Das Verwenden von loop Variablen ausserhalb des loops

    for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
        System.out.print(y +" ");
    }
    System.out.println(x +" ");     // kompiliert nicht
    
**x** wird innerhalb des Initialisierungsblock deklariert, aber ausserhalb mit dem 2. print Statement
angesprochen.

## for-each statement
Seit Java 5 gibt es den erweiterten for loop, welcher speziell für die Iteration von Arrays und Collections gemacht wurde
und als for-each loop bezeichnet wird.

    for(datatype instance : collection) {
        // mach etwas mit instance
    }

Die rechte Seite des for-each Statement muss eine built-in Java array oder aber eine Klasse, welche
java.lang.Iterable implementiert (welche die meisten Klassen die von Collections ableiten implementieren)

Einige Beispiele:

    String[] names = {"Hans", "Paul", "Peter", "Kurt"};
    for(String name : names) {
        System.out.print(name +" ");
    } 
    
    Hans Paul Peter Kurt 
    
was printed diese Loop?

    String[] names = new String[3];
    for(String name: names) {
        System.out.print(name +" ");
    }
    
    null null null 
    
Anders als im for loop sind im for-each loop die Komponenten notwendig.

    for(:) {}       // kompiliert nicht
    
    Error:(17, 13) java: illegal start of expression

Und Vorsicht: Solche Fallen stellen die Prüfungsexperten im Exame gerne

    String[] names = new String[]
    for(int name: names) {              // kompiliert nicht
        System.out.print(name +" ");
    }
    


### Der Unterschied zwischen for(:) und for(;;)

    String[] names = {"Hans", "Paul", "Peter", "Kurt"};
    
    for(String name : names) {
        System.out.print(name +" ");
    }
    
    for(int i=0; i > names.length; i++) {
        String name = names[i];
        System.out.print(name +" "); 
    }




## Zurück zu Operators and Statements
[Operators and Statements](OperatorsAndStatements.md) 
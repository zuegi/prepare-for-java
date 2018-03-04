# Erzeugen und Manipulieren von Strings

    String name = "Rene";
    
## Concatenation

3 Regeln für Concat
* Wenn beide Operanden nummerisch sind, versteht man unter dem + eine nummerische Addition
* Wenn beide Operanden vom Typ String sind, dann wird zusammengesetzt
* Der Ausdruck wird von links nach rechts ausgeführt.


    System.out.println(1 + ");              // 3
    System.out.println("a" + "b");          // ab
    System.out.println("a" + "b" + 3);      // ab3
    System.out.println(1 + 2 + "c");        // 3c

Ein Spezialfall ist +=

    String s = "1";
    s += "2";
    s += "3";
    System.out.println(s);      // 123

## Immutability

Strings sind immutable (unveränderlich).

    String s1 = "1";
    String s2 = s1.concat("2");
    s2.concat("3");
    System.out.println(s2);
    
Was ist das Resultat?
"12" - weil s2 bleibt auch trotz dem concat unverändert - der output dieses Ausdrucks (s2.concat("3") veränder s2 nicht!)


## String pool
Java hat einen Ort in der JVM der String Pool genannt wird.
Alle String Literale gehen in diesen Pool und werden so effizient behandelt

    String name = "Rene";               // geht in den String Pool
    String name = new String("Rene");   // geht nicht in den String Pool 
    
Strings, welche mit new String() instanziert werden sind nicht im String Pool und sind somit weniger
effizent als String im String pool.


## Wichtige String Methoden

length()
 System.out.println("animals".length()); 
charAt() | |
indexOf() | |
substring() | |
toLowerCase() | |
toUpperCase() | |
equals() | |
equalsIgnoreCase() | |
startWith() | |
endsWith() | |
contains() | |
replace() | |
trim() | |


## Methoden aneinander ketten


## Zurück zu Core API
[Operators and Statements](CoreAPI.md) 
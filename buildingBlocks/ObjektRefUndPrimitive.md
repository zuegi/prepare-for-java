# Unterscheidung zwischen Objekt Referenzen und Primitiven

Java Applikationen bestehen aus 2 Typen von Daten:
* Primitive Typen (primitive type)
* Referenz Typen (referenz type)

## Primitive Typen

Java besitzt **8** sogenannte **built-in** typen, welche Java Primitive Typen genannt werden.

Keyword | Type | Bespiel
------- |----- |-----------
boolean | true oder false | true
byte | 8-bit integral value | 123
short | 16-bit integral value | 123
int | 32-bit integral value | 123
long | 64-bit integral value | 123
float | 32-bit floating-point value | 123.45f
double | 64-bit floating point value | 123.456
char | 16-bit Unicode value | 'a'

Jeder nummerische Typ benutzt 2x mehr Bits, als sein nächst kleinerer Typ, 
z.B. *short* braucht 2x mehr Bits als *byte*

Ein **byte** kann Werte enthalten von **-128** bis **127**. Ein byte ist 8 Bits und 
ein Bit hat 2 mögliche Werte (0 oder 1). 

    2ˆ8 = 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2
        =   4   8   16  32  64  128 256 
        
Die 0 wrid ebenfalls einbezogen und diese Werte Java als positive Zahl und sog geht
der Zahlenrange von -128 bis 127.
Die Anzahl der bits verwendet Java für das Allozieren von Memory einer Variablen. Schreibt man

    int num;
    
so reserviert Java **32 bits**.

Wenn eine Zahl im Code präsent ist, so wird diese als Literal bezeichnet. 
Java erwartet (by default) mit einem **Literal** einen primitiven Typ **int**

Wird ein Literal geschrieben, was den maximalen Wert eines int Type überschreitet
(Integer.MAX_VALUE) so gibt der Compiler folgende Fehlermeldung aus:

    int num = 2_147_483_648;
    java: integer number too large: 2147483648
    
Damit wir dieses Literal abspeichern können (die _ sind valide, dazu kommen wir noch),
fügen wir der Zahl ein L hinzu. Es geht ein kleines l oder aber auch ein grosses L. 
Es wird aber empfohlen eine grosses **L** hinzu zufügen.

    long num = 2_147_483_648L;
    

Seit Java 7 ist es möglich die Literale mit einem _ zu unterteilen, damit sie einfacher
zu lesen sind. Die _ dürfen an jeder Stelle stehen ausser am Anfang, am Ende, sowie
vor und nach einem . (Dezimalpunkt). Beispiele

    int million = 1_000_000;                // korrekt
    int million1 = _1_000_000;              // kompiliert nicht
    int million1 = 1_000_000_;              // kompiliert nicht
        
    double notAtStart = _1000.00;           // kompiliert nicht
    double notAtEnd = 1000.00_;             // kompiliert nicht
    double notByDecimal = 1000_.00;         // kompiliert nicht
    double notByDecimalAfter = 1000._00;    // kompiliert nicht
    
    double notByDecimalAfter = 1_00_0.0_0;  // korrekt, aber kaum lesbar
    

Eine andere Möglichkeit die Zahlen zu definieren ist das Basis System. Die Zahlen 0-9 sind
das Dezimal-System mit welchem wir rechnen. Es gibt aber noch weitere Formate

    Basis-System                Prefix          Beispiel
    ============                ======          ========
    octal ( 0 -7)               0               017
    hexadecimal(0-9 und A-F)    0x,0X           0xFF oder 0XFF
    binary (0-1)                0b,0B           0b10 oder 0B10
    

Auch wenn das für das Examen nicht relevant ist, hier ein paar Beipsiel zum Rechnen

    System.out.println(56);         // 56       Base 10
    System.out.println(0b11);       // 3        Base 2
    System.out.println(017);        // 15       Base 8
    System.out.println(0x1F);       // 31       Base 16
    
#### Base 2 (binary)
Wir beginnen ganz rechts die erste Zahl zu zählen, das sie eine 1 zählt sie auch 1.
Die 2 Zahl ist ebenfalls eine 1, also zählt sie 2 und das zusammen gibt 3.
Wir machen es genau wie im Dezimalsystem und nehmen eine Stelle dazu. 
 
128er | 64er | 32er | 16er | 8er | 4er | 2er | 1er | Dezimal
----- | ---- | ---- | ---- | --- |---- | --- | --- | -------
  |  |  |  |  |  |  | 1 | 1 | 3
  |  |  |  |  |  | 1 | 1 | 1 | 7
      
#### Base 8 (octal)
Wir beginnen wieder mit der Zahl ganz rechts und diese ist 7 und weil 7 kleiner als 8 ist,
zählt sie auch 7. Eine Stelle nach links ist die 1, welche in einem Basis-System auf
dieser Position als 8 zählt - macht zusammen 8+7= 15

#### Base 16 (hexadecimal)
Wir beginnen wieder mit der Zahl ganz rechts was ein F ist und sein Wert ist 15, weil 9 zählt 9
und A -F zählt 0-6, als F=6. Zusammen gibt das F = 9+6=15. Eine Stelle nach Links ist die Zahl 1
und die zählt 1 x 16 und damit gibt es ein Total von 16 + 15 = 31.

 

 




    


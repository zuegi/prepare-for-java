# Java Building Blocks

Nach dem OCA Buch von Jeanne Boyarsky und Scott Selikoff


* [Klassen](Klassen.md)
* [Kommentare](Kommentar.md)
* [Objekte](Objekte.md)
* [Pakete](Pakete.md)
* [Objekt Referenzen und Primitive Typen](ObjektRefUndPrimitive.md)
* [Erzeugen von Variablen](VariablenErzeugen.md)
* [Vorteile von Java](VorteileVonJava.md)

[Zurück zum README](../README.md)

## Zusammenfasung

Java Klassen bestehen aus Felder und Methoden. Ein Objekt ist eine Instanz aus einer Java Klasse.
Es gibt 3 Arten von Kommentaren: Ein einzeiliger Kommentar (//), ein mehrzeiliger Kommentar(/* */) 
und ein Javadoc Kommentar(/** **/).

Java beginnt eine Programm-Ausführung immer über die main() Methode. Die meistens verwendete
Signatur ist **public static void main(String[] args) {}**. Argument werden nach dem Aufruf des 
Klassennamens übergeben im Stile von java NameOfClass Argument1 Argument2. Argumente sind indexiert
und starten bei 0.

Java wird organisiert in Verzeichnissen, den sogenannten **package**s. Um eine Klasse in einem
anderen Paket zu referenzieren wird ein import Statement verwendet. Eine Wildcard (*) am Ende eines
import Statement bedeutet, dass alle Klassen in diesem Paket importiert werden. SubPakete werden
dabei nicht importiert. __java.lang__ ist ein spezielles Paket, was nicht explizit importiert werden muss.

Ein Konstruktor erzeugt ein Java Objekt und wird wie der Klassenname geschrieben und hat keinen
Return Type. Wenn ein Objekt erzeugt wird, dann werden Felder und initalizer blocks zuerst initalisiert.
Danach wird der Konstruktor aufgerufen.

Primitive Typen sind der Grundbaustein von Java Typen. Sie werden in Referenz Typen addressiert.
Ein Referenz Typ kann Methoden haben und ein null Wert zugewiesen werden.
Im Gegensatz zur normalen Zahlen, können nummerische Literale mit einer 0 (octal), 0x(hex), 0X(hex),
0b(binary), oder 0B(binary) beginnen. Nummerische Literale dürfen auch Underscores (_) beinhalten, 
solange sie 2 Zahlen direkt miteinander verbinden.

Das Deklarieren von Variablen verlangt einen Daten Typ und einen Namen. Feldvariablen einer Klasse
sind automtatisch mit "zero" oder null Wert während der Instanzierung belegt. Lokale Variablen müssen
immer initialisiert werden. 

Idenifiers dürfen Buchstaben, Zahlen, $, oder _ beinhalten, allerdings dürfen sie nicht mit
einer Zahl beginnen.

Scope bezeichnet man einen Code Abschnitt in welchem auf Variablen zugegriffen werden können.
Bezüglich dem Scope gibt es Instanz Variablen, Klassen Variablen und lokale Variablen.
Instanz Variablen sind keine statischen Felder innerhalb der Klasse. Klassen Variablen sind
statisch Felder innerhalb der Klasse und lokale Variablen werden in einer Methode deklariert.

Für gewisse Klassenelement ist die Reihenfolge in einer Java Klasse wichtig. Package Statements 
kommen immer zuerst. Danach folgen import Statements und Klassen Deklaration. Felder und Methoden
dürfen in beliebiger Reihenfolge der Klasse geschrieben werden.

Der Garbage Collector ist verantwortlich für das Löschen von Objekten aus dem Memory, wenn sie nicht
mehr angesprochen werden können. Ein Objekt wird zum Löschen markiert wenn keine Referenzen mehr
auf das Objekt zeigen oder seine Referenzen aus dem Scope getreten sind. Die finalize() Methode 
läuft einmalig für jedes Objekt, wenn es zum ersten Mal garbage collected wurde.

Java Code ist Objekt-orientiert, was bedeutet, dass Code in Klassen definiert wird. Access modifiers
ermöglichen Klassen ihre Daten zu kapseln. Java ist Plattform-unabhängig und kompiliert in Bytecode.
Java ist robut und einfach, weil es keine Pointer zu verwalten hat. Zudem ist Java sicher, weil 
es in einer virtuellen Maschine läuft.

[Zurück zum README](../README.md)

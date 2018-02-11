# Objekte zerstören

Java stellt einen sogenannten _Garbage Collecter_ zur Verfügung, welcher automatisch nach Objekten
sucht, welcher nicht mehr verwendet werden.
Alle Java Objekte werden im sogenannten Memory **Heap** gespeichert. 
Der Heap, welcher auch als freier Speicher bezeichnet wird, repräsentiert ein grooser Pool von
freiem Memory, welches der Java Applikation zugeteilt wurde. Der Heap ist immer limitiert 
durch seine Grösse. Wenn also zu viele Objekte in den Heap gestellt werden, kann es zu 
einer _out of memory_ Exception kommen.

## Garbage Collection
Garbage collection ist der Prozess, welcher automatisch Memory freimacht durch das Löschen
von Objekten, welche nicht mehr länger erreichbar sind in der Applikation.

Java stellt eine Funktion _System.gc()_ zur Verfügung. Jetzt könnte man denken, dass diese
Methode den garbage collector anstösst. Das ist aber nicht der Fall. Java kann diesen Aufruf
völlig ignorieren und interpretiert diesen Aufruf höchsten als: "Hey Java, jetzt wäre doch 
ein guter Zeitpunkt um den garbage collector anzustossen". 

Folgende Reglen beachtet der Gargabe Collector, bevor er ein Objekt löscht:
* Das Objekt hat keine Referenzen mehr, die auf das Objekt zeigen.
* Alle Referenzen des Objektes sind ausserhalb des Scopes.

*Referenzen* sind Variablen, welches benannt werden kann und den Zugriff auf ein zugeordnetes Objekt
ermöglicht. Eine Referenz kann einer anderen Referenz zugewiesen werden, einer Methode übergeben werden,
oder aus einer Methode zurückgegeben werden. Alle Referenz Variablen haben dieselbe Grösse,
egal von welchem Typ sie sind.

*Objekte* sind im Heap und haben keine Namen und deshalb gibt es keine Möglichkeit auf sie zu zugreifen,
ausser über eine Referenz. Objekte können in allmöglichen Typen und Grössen erzeugt werden. 
Aber sie können keinem anderen Objekt zugewiesen werden, noch können sie einer Methode übergeben, 
noch von einer Methode konsumiert werden.

Es ist das Objekt, welches vom Gargabe Collector gesammelt und gelöscht wird und nicht seine Referenz.

In der Prüfung ist es ratsam die Zuweisungen von Referenzen auf Objekte aufzuzeichnen.
Als Beispiel dieser Code:

    public class Scope {
        public static void main(String[] args) {
            String one, two;
            one = new String("a");
            two = new String("b"); 
            one = two;
            String three = one;
            one = null;
        } 
    }

## finalize()
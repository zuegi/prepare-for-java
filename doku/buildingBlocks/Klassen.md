# Klassen versus Files

In den meisten Fällen wird in Java eine Klasse in ihrem eigenen File erstellt.
z.B. Animal.java

    public class Animal {
        String name; 
    }

Meistens wird diese Klasse als Public deklariert, was bedeutet das irgend 
eine Code Stelle diese Klasse Animal aufrufen kann.

Interessanterweise verlangt aber Java nicht, dass eine Klasse als **public** deklariert wird.

Zum Beispiel funktioniert auch diese Klasse so:

    class Animal {
        String name; 
    }
    
    
Es ist sogar möglich 2 Klassen in einem File unterzubringen.

    class Animal {
        String name; 
    }
    class Animal2 {
        
    }
    

Wenn man aber eine **Klasse** als **public** deklariert, so muss auch der **Filename**
so benannt werden.

 Animal.java -> puplic class Animal {}
 
    public class Animal {
        String name; 
    }
    class Animal2 {
        
    }

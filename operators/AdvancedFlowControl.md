# Advanced Flow Control verstehen

## Labels
Ein Label ist ein optionaler Zeiger auf den Kopf eines Statements, wleches der Applikation es ermöglicht
dorthin zu springen.
Ein Label ist ein einziges Wort gefolgt von einem **:**


    int[][] myComplexArray = {{5, 2, 1, 3}, {3, 8, 8, 9}, {5, 7, 12, 9}};
    outer_loop: for (int[] mySimpleArray: myComplexArray) {
        INNER_LOOP: for (int i=0; i<mySimpleArray.length; i++) {
            System.out.print(mySimpleArray[i] +"\t");
        }
        System.out.println();
    }
    
Das Label kann mit Grossbuchstaben, aber auch mit kleinen Buchstaben geschrieben werden.
Oder auch gemischt

    ouTer_loop:
    Outer_loop:
    OUTER_LOOP:
    outer_loop:

## break
Ein break Statement transferiert die Flow Control ausserhalb des Codeblocks zwischen den {}

    optionalLabel: while(booleanExpression) {
        // mach etwas
        
        // irgendwo im loop
        break optionalLabel;
    }

Das break Statement kann ein optionales Label ausweisen. Ohne das optionale Label endet das break
Statement den nächsten innnersten Loop. Ein Label erlaubt es uns auf das schliessende Element 
eines höheren Level eines äusseren Loops zu springen.

    

## continue

    optionalLabel: while(booleanExpression) {
        // mach etwas
            
        // irgendwo im loop
        continue optionalLabel;
    }

## Zurück zu Operators and Statements
[Operators and Statements](OperatorsAndStatements.md) 
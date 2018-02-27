# prepare-for-java
My preparations to learn Java and the associated certifications
Half in english, half in german

## Inhaltsverzeichnis
* [Building Blocks](buildingBlocks/BuildingBlocks.md)
  * [Klassen](buildingBlocks/Klassen.md)
  * [Kommentare](buildingBlocks/Kommentar.md)
  * [Objekte](buildingBlocks/Objekte.md)
  * [Pakete](buildingBlocks/Pakete.md)
  * [Objekt Referenzen und Primitive Typen](buildingBlocks/ObjektRefUndPrimitive.md)
  * [Erzeugen von Variablen](buildingBlocks/VariablenErzeugen.md)
  * [Vorteile von Java](buildingBlocks/VorteileVonJava.md)

* [Operators and Statements](operators/OperatorsAndStatements.md)
  * [Binäre arithmetische Operatoren](operators/BinaryArithemticOperators.md)
  * [unäre Operatoren](operators/UnaryOperators.md)
<<<<<<< HEAD
  * [Zusätzliche binäre Operatorenbreak](operators/AdditionalBinaryOperators.md)
  * [Binäre arithmetische Operatoren](operators/BinaryArithemticOperators.md)
  * [unäre Operatoren](operators/UnaryOperators.md)
  * [Zusätzliche binäre Operatoren](operators/AdditionalBinaryOperators.md)
  * [Statements](operators/JavaStatements.md)
  * [Advanced Flow Control](operators/AdvancedFlowControl.md) 
=======
  * [Zusätzliche binäre Operatoren](operators/AdditionalBinaryOperators.md)
>>>>>>> bd5804d5546402266e9e814347fc039f05b53cd2


Create this project from scratch
==========================================
Install gradle

    brew install gradle
     
Create a void repsoitory prepare-for-java on github. (it's done already)
Clone that project into your workspace 

    $ git clone https://github.com/zuegi/prepare-for-java.git
    $ cd prepare-for-java
    $ gradle init
    
Gradle created this folder structure

    $ ls
    build.gradle
    gradle
    gradlew
        gradle-wrapper.jar
        gradle-wrapper.properties
    gradlew.bat
    settings.gradle
    
Above files will be checked in into git - later

Create a multi module project in gradle

    $ mkdir createAndDestroyObjects
    $ cd createAndDestoryObjects
    $ mkdir -p src/{main,test}/{java,resources}
    $ touch build.gradle
    
The build.gradle file in the folder createAndDestroyObjects should containt following lines.

    build.gradle
        apply plugin: 'java'
        apply plugin: 'application'
     
 
 In the root of the project create following line
 
     settings.gradle
        include 'createAndDestroyObjects'


Gradle build from the root of the project

     $ ./gradlew build
     
 
 Check your source into github
 
 
 # Markdown
[Markdown] (https://guides.github.com/features/mastering-markdown/)
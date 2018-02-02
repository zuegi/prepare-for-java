Setup Project preparation-for-java
==================================

Soll ein Multi-Module Project in gradle werden.
Und auf einem git repository abgelegt werden, wie z.B. github, gitlab oder bitbucket

1. Install gradle mit 

	$ brew install gradle

Installiert gradle in folgendes Projekt /usr/local/Cellar/gradle


2. Projekt erstellen
In meinem Fall erstelle ich das Projekt unter /Users/rene/Entwicklung/projekte/ws/ 

	$ mkdir best-dev
	$ cd best-dev
	$ gradle init

Der gradle init Befehlt hat folgende Struktur im Directory best-dev erstellt:

best-dev
	build.gradle	
	gradle		
	gradlew
		gradle-wrapper.jar
		gradle-wrapper.properties
	gradlew.bat	
	settings.gradle



Ich verwende in meinem Projekt nur noch den gradle Wrapper (siehe auch https://docs.gradle.org/current/userguide/gradle_wrapper.html)
Deshalb müssen auch all diese Files in das VCS eingecheckt werden.


3. Erstellen eines Multi Module Project
Erstelle ein subfolder unter best-dev und führe folgenden Befehl aus
	$ mkdir createAndDestroyObjects
	$ cd createAndDestroyObject
	$ mkdir -p src/{main,test}/{java,resources}


Erstelle eine build.gradle file im neu erstellten createAndDestroyObjects Folder
	$ touch build.gradle
	
Im createAndDestroyObjects/build.gradle File trage folgende Zeilen ein:
	apply plugin: 'java'
	apply plugin: 'application'
	mainClassName = 'gruss.Gruss'

Das java plugin wird gebraucht, weil es ein Java Projekt ist, das application plugin, weil es eine Java Applikation werden soll


Das settings.gradle im root folder (best-dev) muss nun noch ein include Statement enthalten:

settings.gradle
	inlcude 'createAndDestroyObjects'


4. Build erstellen
Aus dem root folder (best-dev) heraus, kann nun der folgende Befehl abgesetzt werden:

	$ ./gradlew build

Damit wird ein Build des gesamten Projektes - inkl. createAndDestroyObjects erstellt.
Die Build Artefkate des Moduls createAndDestroyObjects sind unter folgendem Pfad zu finden:
	$ cd best-dev/createAndDestroyObjects/build


5. Einlagern in eine git Repository
    https://guides.github.com/activities/hello-world/
Git Repository auf github.com angelegt unter zuegi


6. OK, dann bin ich wohl ready für weitere Projekte






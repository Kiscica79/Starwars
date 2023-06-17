Lebegőpontos jelentése: double vagy float

Írj egy Urhajo interfészt, ami egy legyorsuljaE metódust tartalmaz. A metódus paramétere egy Urhajo objektum, és egy logikai értékkel tér vissza. Legyen egy milyenGyors metódusa is, ami nem kér paramétert, és az Urhajo gyorsaságát fogja visszaadni.

Írj Hiperhajtomu interfészt, ami egy visszatérés nélküli hiperUgras() metódust tartalmaz!

Írj egy LazadoGep absztrakt osztályt, ami implementálja az Urhajo interfészt.
Az osztály a következő private láthatóságú adattagokkal rendelkezik: egy lebegőpontos sebesség, és egy logikai meghibasodhatE.
Az osztály rendelkezzen paraméteres konstruktorral, ami beállítja az adattagokat.
Legyen egy public elkapjaAVonosugar absztrakt metódusa, ami egy logikai értékkel tér vissza. Valósítsd meg továbbá az interfész metódusait! A gyorsaság lekérdezésekor add vissza a LazadoGep sebességét. Egy LazadoGep egy másik LazadoGep objektumot akkor tud legyorsulni, ha az meghibásodhat, és a gyorsasága kisebb, mint az övé.
A MilleniumFalcon objektumot csak akkor tudja legyőzni, ha gyorsasága kétszer nagyobb. (EZT A RÉSZT NAGYON GONDOLD ÁT akár konkrét számokkal, hogy mit jelent!!!)
Az osztálynak legyen továbbá getter és setter metódusa az adattagjaihoz, és legyen szöveges formára alakítható, kiírva az adattagok értékét.

Írj egy XWing osztályt, ami a LazadoGep leszármazottja, és megvalósítja az Hiperhajtomu interfészt! Az osztálynak egy default konstruktora legyen, ami beállítja az X-Wing tulajdonságait. Az X-Wing sebessége 150, és meghibásodhat. Ha az X-Wing hiperugrást végez, akkor sebessége egy 0-100 közötti véletlenszerű lebegőpontos számmal nő.
Az X-Wing-et akkor kapja el a vonósugár, ha meghibásodhat, és sebessége kisebb, mint 10000.
Az osztály legyen továbbá szöveges formára alakítható. Az adattagok értékein kívül írja ki azt is, hogy egy X-Wingről van szó.

Írj egy MilleniumFalcon osztályt, ami implementálja az Urhajo és Hiperhajtomu interfészeket. Az osztálynak legyen egy lebegőpontos tapasztalat adattagja. Az osztály rendelkezzen egy default konstruktorral, ami 100-ra állítja az adattag értékét. A metódusai az alábbiak szerint legyenek megvalósítva: a Millenium Falcon gyorsasága a tapasztalatának kétszeresével egyezik meg, és bármilyen Urhajo-t képes legyorsulni, akinek gyorsasága kisebb, mint a Falcon gyorsasága. Ha a Millenium Falcon hiperugrást végez, akkor tapasztalata 500-al nő.
Az osztály legyen szöveges formára alakítható, ami kiírja, hogy a Millenium Falconról van szó, és megadja a tapasztalatát.

Írj egy StarWars nevű futtatható osztályt, Main osztályod NE legyen! A main metódusában hozz létre pár példányt a megírt classokból és használd rajtuk a megírt metódusaid!

Hozz létre egy XWing és egy MilleniumFalcon típusú objektumot!
Írasd ki, hogy a Falcon le tudja-e gyorsulni az X-Winget!
Írasd ki, hány hiperugrást kell végeznie az X-Wingnek, hogy legyorsulja a Falcont!



//? ~~~~~~~~~~~~~~~~~~~~~ Class Concept ~~~~~~~~~~~~~~~~~~~~~~
//! Défintion d'une classe: Une classe est un élément dans notre programme, représentant une entité (Students, Vehicle, Animal),
//* ou une idée (Song, Reseau, Log, etc...), et elle représente différents éléments.
//! Note: Pour Java, il nous faut une classe de départ pour démarer , et déclarer notre méthode main, içi on l'appelle "Main".
//! Note: La classe doit avoir le meme nom que le fichier.

//! 1. Portée de la classe:
// - a) public: niveau d'accès publique (accéssible partout)

public class Main {
    //! 📌Note📌: Chaque fois définir cette méthode main pour la classe (point d'entrée de cette classe)
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Class courses in Java!!");
        System.out.println("-------------------------------------------------");
        //! Instanciation de la classe Cat 🐈:
        Cat miaw = new Cat();
        System.out.println(miaw);  //? Output: I am just Cat ? :Cat@2f92e0f4  || est l'emplacement mémoire de cet objet (une identité unique)
        Cat bob = new Cat();
        System.out.println(bob);  //? Output : I am just Cat ? :Cat@65b54208  || l'emplacement mémoire de cet objet 
    }
}
// - b) private: niveau d'accès privé (accessible uniquement à l'intérieur de la
// classe)
// ⚠️ Une classe **ne peut pas** être déclarée `private`, mais ses membres
// (attributs/méthodes) peuvent l’être.
// class Exemple {
//     private int Value; // Accessible uniquement dans cette classe

//     private void Display() {
//         System.out.println("Méthode privée");
//     }
// }
// - c) protected: niveau d'accès protégé (accessible dans la même classe, le même package et les sous-classes)
// ⚠️ Une classe **ne peut pas** être déclarée `protected`, mais ses membres
// (attributs/méthodes) peuvent l’être.
// class Parent {
//     protected int nombre = 42; // Accessible dans les classes filles et le même package
// }

// class Enfant extends Parent {
//     void afficher() {
//         System.out.println(nombre); // Accessible grâce à l'héritage
//     }
// }

//! 📌 Remarque importante :

//* 🔹Une classe ne peut être que public ou sans modificateur (package-private).
//* 🔹private et protected s'appliquent uniquement aux attributs et méthodes à l'intérieur d'une classe.
//* 🔹Au délà de cet exemple, faites de telle sorte qu'à faire un fichier, une classe en Java.
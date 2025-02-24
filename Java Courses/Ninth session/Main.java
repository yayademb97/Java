// package Java Courses.Ninth session;

//! 📖♨️ Method ♨️📖:
//! 🚀 Définition 🚀: Une méthode est une fonction en orienté-objet, un bloc de code qui exécute une tâche spécifique. 
//!                    Elle permet de réutiliser du code, d'organiser le programme et de le rendre plus modulaire.

//? 💬 Type de méthode en Java 💬:
    //* - 1️⃣ Méthodes statiques (appartiennent à la classe et peuvent être appelées sans instance)
    //* - 2️⃣ Méthodes avec retour et sans retour
    //* - 3️⃣ Méthodes avec ou sans paramètres
    //* - 4️⃣ Méthodes d'instance (nécessitent un objet pour être appelées)



    

//! 📝 Summary 📝: 
//! Il est obligatoire de programmer en Java en Orienté-Objet, 
//! le programme minimale qu'on a est une classe dans notre exemple "Main",
//* avec une méthode main. Par défaut lorsque nous allons exécuter notre programme, 
//* la machine virtuelle Java (JVM) va chercher notre classe principale qui est la classe "Main", 
//* ça veut dire qu'on a pas besoin de l'instancier nous meme, tout en cherchant notre méthode "main", 
//! qui est notre point d'entrée du programme.


public class Main {
    

    //! 📌 Note 📌: Cette methode contient un mots-clé "static", un type de retour "void" (retourne rien quand elle s'exécute), 
    //!              suivi de nom de la methode , après en paranthèse avec les agruments de la methode.

    public static void main(String[] args) 
    {
        //! 🔹Remarque: Avec cette classe suivie de la méthode main, on peut se contenter d'utiliser des méthodes natives à Java.
        //* Exemple: Affichage "Hello, World!"
        System.out.println("Hello, World!!!");
        //! 🔹De ce fait il y'a beaucoup de type de classes qui sont natives à Java telles que (les String, les tableaux, etc ...).

        //! Alors ce qui nous interesse, ce n'est pas autre que d'utiliser des méthodes, c'est d'en créer aussi.
        //! C'est ce qu'on appelle les fonctions liées à la prommation orienté-objet avec sa réutilisabilité.


        //* Exemple: Essayons de déclarer une variable et l'initialiser ensuite à 0, et après essayons de réaffecter sa valeur en 15 tout en l'affichant.
        int age = 0;  // Initialisation de la variable
        //* ~~~~~~~~~ 1ère methode ~~~~~~~~~~~~~~~~*/
        // System.out.println(age);  //? Output: 0
        // age = 15;
        // System.out.println(age);  //? Output: 15
        System.out.println("Avant modification: " + age);  //* Affichage avant modification

        //! Tester la methode en faisant appel 
        prog(age);   // Passing 'age' to the method
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sumNumber(15, 25);  //? Output: 40
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        mySumNumber(20, 35); //? Output: 55

    }

    //! 1️⃣ Méthodes statiques (appartiennent à la classe et peuvent être appelées sans instance)

    //* ~~~~~~~~~ 2ème methode ~~~~~~~~~~~~~~~~*/

    //! 🔹Illustrons célà avec une méthode:
    public static void prog(int age)
    {
        age = 15;   //! Méthode prog() qui modifie la valeur de l'âge et l'affiche
        System.out.println("Après modification: " + age); // Affichage après modification
    }

    //! 📌 Note 📌: Une méthode doit se charger d'une seule instruction telle que soit le langiage de programmation
    //!🔹Exemple: Un programme qui doit charger une image, la positionner, et l'animer.
    //! On va créer une méthode pour tout célà
    public static void loadWindows()
    {
        //* Code here...
    }
    public static void loadSprite()
    {
        //* Code here...
    }
    public static void animateSprite()
    {
        //* Code here...
    }

    //! 🔹On les appelle dans la methode main()

    //* - 2️⃣ Méthodes avec retour et sans retour
        //* -  Méthodes avec retour
        public static int sumNumber(int a, int b)
        {   
            int sum = a + b;
            System.out.println("La somme de deux entier dans une méthode est: " + sum);
            return sum;  //! 🔹 "return" est une instruction qui arrete la methode.
        }

        //* -  Méthodes sans retour
        public static void mySumNumber (int c, int d)
        {
            int mySum = c + d;
            System.out.println("La somme de deux entier dans une méthode est: " + mySum);
        }
}

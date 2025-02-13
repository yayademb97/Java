//? Introduction de Java

//* Prémièrement : On va définir une classe

//* Comme on le sait une classe réprésente une entité. 

//* Pour définir notre clase en Java, on mets le key-word "class" suivi du nom de la classe

public class Main {
    //* Deuxièmement: Une fois qu'on a créé notre classe, n va directement lui attribuer une méthode(fonction), 
    //* qui sera le point d'entrée de notre programme 
    //* C'est-à-dire, si on exécutera notre programme, Java cherchera cette méthode-là.

    //! Définition de la méthode:
//* niveau-d'accès    modificateur      type de retour     nom de la méthode     paramètre 
//*  v                  v                   v                    v                 v
    public            static                void                main            (String[] args) {
        System.out.println(("Hello World!!!"));
    }
}

//! Note: 
//! public → La méthode doit être accessible par la JVM depuis n'importe où.
//! static → Permet à la JVM d'appeler cette méthode sans créer d’instance de la classe Main.
//! void → La méthode ne retourne rien.
//! main(String[] args) → Signature obligatoire de la méthode principale en Java. 
//! Elle prend un tableau de chaînes de caractères (args), qui peut contenir des arguments passés au programme.

//! System.out.println(("Hello World!!!")); : affichera au console -> Hello World !!!


// * Troisièmement: Pour exécuter notre programme java => `java "nom_de_fichier.java"`

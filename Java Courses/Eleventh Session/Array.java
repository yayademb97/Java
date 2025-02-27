

//! 𝄜♨️ Array in Java ♨️𝄜:
//* Illustration de la notion d'Array en Java: Les Arrays sont un cas très particulier, puisqu'en Java , 
//* il y'a pas de rigeur en la gestion de l'espace mémoire, puique quand on veut  travaiiller une donnée spécifique, 
//* il nous suffit juste de la créer, et de préciser son type pour en utiliser, et c'est la machine virtuelle de Java (JVM),
//* qui va s'occuper de communiquer avec notre système d'exploitation pour faire le nécéssaire, que ce soit de l'allocation de la mémoire,
//* et ensuite , s'occuper de leur libération, pour éviter le gaspillage de ressource , ou pire les fuites de mémoire. 


//! Définition: en Java, un Array (tableau), est une structure de données qui permet de stocker plusieurs valeurs du meme type dans une seule variable.



public class Array{

    //* a) Déclaraion d"Array sans initialisation:
    int [] numbers ;
    String [] studentNames;

    //* b)Déclarations d'Array avec intialisations:
    int [] numbers = {10, 20, 30, 40, 50};
    String [] studentNames = {"Yaya Dembele", "Ali Essoudani", "Mouadh Jenouiz", "Ghada Sassi"};

    //* c)Accès aux éléments d'Array: On utilise l'index pour accéder aux éléments d'Array (tableau).
    //*   L'index commence tujours à partir de "0".

    System.out.println(numbers[1]);   //? Output: 20 
    System.out.println(numbers[3]);   //? Output: 40 
    System.out.println(studentNames[3]);   //? Output: Ghada Sassi 
    System.out.println(studentNames[0]);   //? Output: Yaya Dembele 

    //* d) Modification d'un élément de l'Array:
    numbers[1] = 25;
    System.out.println(numbers[1]); //? Output: 25

    //* e) Parcourir un Array:
        //* - Avec une boucle for:
        for(int i = 0; i < = numbers.length ; i ++){
            System.out.println(numbers[i])
        }

        //? Output:
        //* 10
        //* 25
        //* 30
        //* 40
        //* 50

        //* - Avec une boucle for-each
        for(int num : numbers){
            System.out.println(num);
        }

    //* f) Longuer d'un Array (tableau): On utilise length pour obtenir la longueur d'un Array (tableau)
    System.out.println(numbers.length);


    //* g) Tableau Multidimensionnel: Un tableau (Array) multidimensionnel est un tableau qui contient d'autres tableaux.
    int [][] matrice = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    }

    System.out.println(matrice[1][2])  //? Output: Affiche 6 : la deuxième (2ème) ligne troisème (3ème) colonne.


    //* h) Copier un tableau:
        //* - Avec Arrays.copy():
        import java.util.Arrays;
        int [] original = {1,2,3};
        int [] copie = Arrays.copyOf(original, original.length);
        

    publc Array(){

    }
}
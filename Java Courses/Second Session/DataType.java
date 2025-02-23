// package Java Courses.Second Session;

public class DataType {
    // ? Data Types:En Java, les types de données définissent le type de valeurs qu'une variable peut stocker. 
    //* Ils garantissent l'efficacité de la mémoire et la sécurité des types.
    //* Le langage de programmation Java est statiquement typé, 
    //* ce qui signifie que toutes les variables doivent être déclarées avant de pouvoir être utilisées.
    //* Le type de données d'une variable détermine les valeurs qu'elle peut contenir, ainsi que les opérations qui peuvent être effectuées sur elle.
    //* Cela implique d’indiquer le type et le nom de la variable, comme vous l'avez déjà vu :
    
    // ! I) Primitives Types: (stocke les données simples)
    // * - a) "int" (Place en mémoire 4octets) -> fourchette de valeur (min
    // & max): -2 147 483 647
    // * - b) "float" (Place en mémoire 4octets) -> fourchette de valeur (min
    // & max): 1.4x10^-45 à 3.4x10^38
    // * - c) "double" (Place en mémoire 8octets) -> fourchette de valeur
    // (min & max): 4.9x10^-324 à 1.8x10^308
    // * - d) "char" (Place en mémoire 2octets) -> caractère Unicode (min
    // & max): 65536 charactères disponibles
    // * - e) "boolean" (Place en mémoire 1octet) -> true / false
    // * - f) "byte" (Place en mémoire 1octet) -> fourchette de valeur (min &
    // max): -128 à 127
    // * - g) "short" (Place en mémoire 2octets) -> fourchette de valeur (min
    // & max): -32 768 à 32 767
    // * - h) "long" (Place en mémoire 8octets) -> fourchette de valeur (min &
    // max): -2^63 à +2^63-1
        

    //! II) Non-Primitive Types: stocke ls objets ou données complexes

    //! Object Types & "Wrapper Classes"
    //* - a) Integer: La classe Integer encapsule une valeur du type primitif int dans un objet.
    //* - b) Long: La classe Long encapsule une valeur du type primitif long dans un objet.
    //* - c) Boolean: La classe Boolean encapsule une valeur du type primitif boolean dans un objet.
    //* - d) Double: La classe Double encapsule une valeur du type primitif double dans un objet.
    //* - e) Character: La classe Character encapsule une valeur du type primitif char dans un objet.
    //! Other object types built into Java are:
    //* - f) String: Représente une séquence de caractères, semblable à une chaîne de caractères dans d'autres langages.
    //* - g) BigInteger: Représente un entier pouvant avoir une taille quelconque.

    public static void main(String[] args) {
        int ourInt; // we can declare a variable without setting its value || nous pouvons déclarer une variable sans lui assigner une valeur.
        ourInt = 400; // we can assign a value to the variable later in our code || nous pouvons après assigner une valeur à la variable dans notre code
        double pi = 3.14159265; // we can also declare and assign on the same line || ou nous pouvons le déclarer et assigner une valeur en même temps
        boolean bool = true;
        char singleCharacter = 'A';
        
        String multipleCharacters = "ABC";

        System.out.println("Our integer is: " + ourInt);
        System.out.println("Pi is: " + pi);
        System.out.println("Boolean is: " + bool);
        System.out.println("Single character is: " + singleCharacter);
        System.out.println("Multiple characters are: " + multipleCharacters);
        
    }
}

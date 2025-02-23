// import java.lang.reflect.Type;

public class Variable {

    // public static void main(String[] args) {
    //     //? ~~~~~~~ 1) Variables : est tout simplement un terme qui va designer un emplacement en mémoire que nous allons réserver pour y stocker des données
    //     //* On a déjà eu à apprehender les datatypes 
    //     //* Nous allons très vite apprendre à manipuler les objects qui sont associés à ces types.

    //     //* Alors au niveau de notre programme, nous allons apprendre à manipuler les données.
    //     //* C'est pour célà les types primitifs nous serviront.

    //     //! Prémère Chose: Java est un language fortement typé 
    //     //* C'est-à-dire que nous avions des language où l'on peut créer des données sans forcement spécifier quel type de données nous voulons stocker.
    //     //* Mais avec Java, nous avons besoin de spécifier le type de données que nous voulons utiliser pour nos variables.
    //     //* Par exemple: Avec Python, ou PHP, 
    //     //* dont c'est à l'interpreteur de ces languages de deduire quel type de données nous voulons utiliser pour nos variables.
    //     //* C'est beaucoup plus stricte pour Java.
    //     //* Nous allons utiliser des variables de type primitif pour stocker nos données.

    //     //! Deuxième Chose: Déclaration de la variable
    //     //* Nous allons utiliser les types primitifs (int, double, float, bool, etc...) et ensuite donner le nom de notre variable
    //     /*
    //     * - Pas de caractères spéciaux, pas d'espaces
    //     * - Commence par une lettre ou underscore (_)
    //     * - pour une variable de plusieurs mots en camelCase par convention
    //     */ 

    //     //* Exemple: 
    //     int myIntVariable;  //* on peut déclarer une variable sans lui assigner une valeur
    //     int ageUser = 25;   //* On peut le déclarer et l'initialiser en même temps
    //     System.out.println(ageUser);

    //     System.out.println("==================================================");
    //     //! Reassignation du variable
    //     ageUser = 30;
    //     System.out.println(ageUser);


    //     //! Portée de Variable:
    //     //! Une variable de manière générale quelque soit le language, tient sa portée à l'endroit où elle a été déclarée

    // }

    //* Exemples de portées de variables
    // public static void main(String[] args) {
    //     int localVar = 10; //* Portée locale à la méthode
    //     System.out.println(localVar);
    // }

    //! Note: Notre variable n'existe que dans cette contexte, la méthode où elle a été définie, et une fois que nous quittions cette méthode
    //! automatiquement Java détruira cette variable.

    //! Remarque: Contrairement à d'autres languages de programmation tels que C ou C++ , quand on manipulera des données dynamiques,
    //! on aura pas besoin foprcement de libérer la mémoire quand on manipulera des données du types complexes
    //! Java possède ce qu'on appelle un ramasse-miettes (un garbage collector).
    //! Cest-à-dire qu'il va lui même se charger de dtruire, et de liberer la mémoire proprement comme avec Python.
    
    //* Note: Cependant, il est important de savoir que lorsque nous manipulons des données complexes, nous devons nous assurer d'utiliser des objets et non des variables primitifs.


    //?~~~~~~~~~ 2. Variable Particulière: Constant Variable
    //* Une constante est une variable qui ne peut pas être modifiée une fois qu'elle a été déclarée.

    //? Comment déclarer une variable avec Java comme constante:
    //* Il est préférable d'utiliser le mot-clé "final" pour déclarer une variable constante.

    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        System.out.println(MAX_VALUE);
        // MAX_VALUE = 15;  //* Nous pouvons constater qu'içi nous avons une erreur nous notifiant qu'on ne peut modifier une variable "final"
                            //* Puisqu'elle est constante
    }

}
//? ~~~~~~~~~~~~~~~~~~~ Operator ~~~~~~~~~~~~~~~~~~
//! Opérateur: 

/*
 - Affectation
 - Concaténation
 - Réaffectation 
 - Arithmétiques : "+" ; "-";  "*";  "/" ;  "%" ;  "()"
 - Opérateur de comparaison: "<"; ">"; "<="; ">="; "=="; != 
 - Opérateur de logique
 - Opérateur d'Incrémentation
*/ 

public class Operator {

    // * Main Method
    public static void main(String[] args) {
        //* - Opérateur d'Affectation 
        int age = 24;
        System.out.println(age);
        System.out.println("----------------------------------------------------------------");

        //* - Opérateur de Concaténation
        String name = "Ali Dembele";
        System.out.println("My Name is " + name + "\tand I am " + age + "\told!");
        System.out.println("----------------------------------------------------------------");
        //* - Opérateurs Arithmétiques : 
            //* -a) Opérateur d'addition: 
            int num = 20;
            float num1 = 1.5f;
            double result = num1 + num;
            System.out.println("Le résultat de mon opération d'addition est: " + result);
            System.out.println("-------------------------------------------------------------");
            //* -b) Opérateur de soustration: 
            double result1 = num - num1;
            System.out.println("Le résultat de mon opération de soustraction est: " + result1);
            System.out.println("-------------------------------------------------------------");
            //* -c) Opérateur de division : 
            int myDiv = num / 4;
            System.out.println("Le résultat de mon opération de division est: " + myDiv);
            System.out.println("-------------------------------------------------------------");
            //* -d) Opérateur modulo: 
            int myModVariable = num % 6;
            System.out.println("Le résultat de mon opération de modulo est: " + myModVariable);
            System.out.println("-------------------------------------------------------------");
            //* -d) Opérateur de réaffectation:
            int myIntVar = 5;
            int myNewInt = myIntVar;
            System.out.println("Le résultat de mon opération de réaffectation est: " + myNewInt);
            //* - Opérateur de comparaison: 
                //* - Opérateur d'affectation
                float myFloat = 1.014f;
                System.out.println("Ma variable d'affectation (=) est:" + myFloat);
                System.out.println("-------------------------------------------------------------");
                //* - Opérateur de grandeur
                int myVar = 15;
                int myVarOne = 16;
                boolean bool = myVarOne > myVar;
                System.out.println("Le resultat de mon opérateur de supériorité (>):" + bool);
                System.out.println("-------------------------------------------------------------");
                //* - Opérateur d'Infériorité:
                boolean boolOne = myVar < myVarOne;
                System.out.println("Le résultat de mon opérateur d'infériorité (<): " + boolOne);
                System.out.println("-------------------------------------------------------------");

                //* - Opérateur d'égalité
                int myVarTwo = 10;
                int myVarThree = 10;
                boolean isEqual = myVarTwo == myVarThree;
                System.out.println("Le résultat de mon opérateur == est: " + isEqual);
                System.out.println("-------------------------------------------------------------");

                //* - Opérateur de différence (!=)
                boolean isDifferent = myVarTwo != myVarThree;
                System.out.println("Le résultat de mon opérateur != est: " + isDifferent);
                System.out.println("-------------------------------------------------------------");

                //* - Opérateurs logiques:
                boolean condition1 = true;
                boolean condition2 = false;

                //* - Opérateur logique ET (&&)
                boolean andResult = condition1 && condition2;
                System.out.println("Le résultat de mon opérateur && (ET logique) est: " + andResult);
                System.out.println("-------------------------------------------------------------");

                //* - Opérateur logique OU (||)
                boolean orResult = condition1 || condition2;
                System.out.println("Le résultat de mon opérateur || (OU logique) est: " + orResult);
                System.out.println("-------------------------------------------------------------");

                //* - Opérateur logique NON (!)
                boolean notResult = !condition1;
                System.out.println("Le résultat de mon opérateur ! (NON logique) est: " + notResult);
                System.out.println("-------------------------------------------------------------");
                //* - Opérateur d'Incrémentation: Jeu video avec un personnage qui gagne au fur et à mesure de le goldCoins
                int goldCoins = 0;

                System.out.println(goldCoins);  //? Output: 0

                goldCoins += 10;
                System.out.println(goldCoins);  //? Output: 10

                goldCoins += 100;
                System.out.println(goldCoins);  //? Output: 100

    }
}
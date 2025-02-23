public class Condition {
    public static void main(String[] args) {

        // ! 1. if...else : Utilisé pour exécuter un bloc de code si une condition est
        // vraie, sinon un autre bloc est exécuté.

        int value = 24;
        ;
        // ! 📌Note📌: Si on a une seule instructions dans nos condition on peut enléver les
        // "{}", mais au délà d'une il faudrait les mettre.
        if (value == 24 || value == 16)
            System.out.println("Oui!!!");
        else
            System.out.println("Value ne vaut ni 24 ni 16");

        // ! 2. if...else if...else: Utilisé pour tester plusieurs conditions
        // successives.
        int note = 85;
        if (note >= 90) {
            System.out.println("Excellent !");
        } else if (note >= 75) {
            System.out.println("Très bien !");
        } else if (note >= 50) {
            System.out.println("Passable.");
        } else {
            System.out.println("Échec.");
        }
        // ! 3. Opérateur ternaire: Une alternative plus courte à if...else lorsqu'il y
        // a une seule instruction.
        int nombre = 10;
        String resultat = (nombre % 2 == 0) ? "Pair" : "Impair";
        System.out.println(resultat);

        // ! 4. switch: Utilisé pour tester une variable contre plusieurs valeurs.
        int jour = 3;
        switch (jour) 
        {
            case 1:  //* if jour == 1 */
                System.out.println("Lundi");
                break;
            case 2: //* if jour == 2 */
                System.out.println("Mardi");
                break;
            case 3: //* if jour == 3 */
                System.out.println("Mercredi");
                break;
            default:  //* else ou else if jour != 1 || jour != 2 || jour != 3 */
                System.out.println("Jour inconnu");
        }

        //! 📌Note📌: Le break est utilisé pour éviter d'exécuter les cas suivants après un case correspondant.

    }
}

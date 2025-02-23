// package Java Courses.Sixth Session;
public class Loop {
    public static void main(String[] args) {
        // ! Loop
        // ? Defintion : Les boucles en Java permettent d'exécuter un bloc de code
        // plusieurs fois selon une condition. Voici les principales boucles :

        // ! 1. Boucle for: Utilisée lorsque le nombre d'itérations est connu.
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        // ? Output: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // 🔹Explication :
        // * int i = 0 → Initialisation
        // * i <= 10 → Condition
        // * i++ → Incrémentation
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // ! 2. Boucle while: Utilisée quand on ne connaît pas à l'avance le nombre
        // d'itérations.
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // ? Output: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // *🔹Explication : La boucle continue tant que i < 5.

        // ! 3. Boucle do...while: Exécute au moins une fois le bloc avant de vérifier
        // la condition.
        int p = 0;
        do {
            System.out.println("Exécute au moins une fois");
            p++;
        } while (p < 5);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // * 4. Boucle foreach (for-each): Parcourir un tableau ou une liste plus
        // facilement.

        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int n : numbers) {
            System.out.println(n);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // * 🔹Explication : Parcourt chaque élément du tableau nombres et le multiplies
        // par 2.

        // ! 5. Interruption de boucles : break et continue
        // * break : Stoppe complètement la boucle.
        // * continue : Passe à l'itération suivante sans exécuter le reste du bloc.
        for (int q = 0; q < 5; q++) {
            if (q == 3) {
                break; // Arrête la boucle quand i == 3
            }
            System.out.println(q);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int q = 0; q < 5; q++) {
            if (q == 2) {
                continue; // Ignore l'itération où i == 2
            }
            System.out.println(q);
        }

    }
}

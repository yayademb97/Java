// package Java Courses.Eighth Session;

// ! Attribute: En Java, le terme "attribut" fait généralement référence aux champs (variables d'instance ou variables de classe) d'une classe. 
//! Les attributs stockent l'état ou les propriétés d'un objet.

//! 📌 Note 📌: Quand elle est faite au sein d'une méthode, on parle d'une variable.
//!              Par contre les attributs sont définis en dehors de la classe. 👉 (Attribute.java)


public class Main {
    public static void main(String[] args) {
        //* Création d'instances de la classe "Attribute" dans la classe Main 
        Attribute myAttribute1 = new Attribute("Yaya Dembele", 28);
        System.out.println("Hello This is the information regarding my first abject created from Attribute class\n" + myAttribute1);
        System.out.println("----------------------------------------------------------------------------");
        Attribute myAttribute2 = new Attribute("Zeinab Diakité", 25);
        System.out.println("Hello This is the information regarding my first abject created from Attribute class\n" + myAttribute2);

        //* Exemple: Common Mistake
        //* Si j'essaie d'accéder depuis la classe Main à l'attribut "p_myName" définie dans la classe "Attribute.java"
        // System.out.println(myAttribute1.p_myName);  //? Output: Error: Puisque l'attribut est défini "private" , 
                                                       //* donc du coup on ne peut pas l'accéder à une classe extérieure.
    }
}

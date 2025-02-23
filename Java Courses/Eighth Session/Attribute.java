// package Java Courses.Eighth Session;




public class Attribute {
    //* Attribute Fields:
    private String myName;
    private int age;
    //*  📌 Note 📌: Comme les attributs sont définis en dehors de toute méthode, 
    //*               mais à l'intérieur de la classe, par defaut leur niveau d'accéssibilité serait "private"


    //* 🔹Remarque: À partir de là, on va modifier le constructeur, comme on le sait on va lui donner des paramètres.
    //*              Quand on va construire un objet de la classe Attribute, 
    //*              on va lui spécifier que cet objet possède un nom "myName", un age "age", c'est l'instanciation de la classe.

    //! 📌 Note 📌: Pour stocker ces informations je vais le stocker au niveau de mon objet, 
    //*              ou de cette instance là pour ne pas perder mes informations.
    //*              On va seuleent affecter aux attributs de la classe en modifiant le constructeur comme il a besoin dans notre cas
    //*              d'un nom "myName", et de l'age "age".

    //! Constructor
    public Attribute(String p_myName, int p_age)
    {
        this.myName = p_myName;  //* initialisation de l'attribut myName */
        this.age = p_age;        //* initialisation de l'attribut age */

        //* 🔹Note: "this" le mot-clé qui fait référence à l'instance de la classe.

        //* Verifions que les attributs sont bien enrégistrés:
        System.out.println(this.myName + " " + this.age);


        //? 📌 Note ⚠️: Le niveau d'accès"private" exprime que cet attribut n'est accéssible (lire, modifier, etc...) que dans la classe où elle a été définie.
    }


    //* Méthode getter
    public String getMyName() {
        return myName;
    }

    //* Méthode setter
    public void setMyName(String p_myName) {
        this.myName = p_myName;
    }

    //* 📌 Note ⚠️: Les getters et setters permettent un accès contrôlé aux attributs.
}

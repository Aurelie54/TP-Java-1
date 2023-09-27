public class Personne {
    public String prenom;
    public String nom;
    public int age;

    public Personne(String prenom, String nom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void fullName() {
        System.out.println(nom + " " + prenom + age);

    }
}

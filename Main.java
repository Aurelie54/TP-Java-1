public class Main {

    //fonction
    public static void main(String[] args) {
  
        User cesi = new User ("lili", "123", 27, "@cesi.com");
        cesi.fullInfos();

        User admin = User.createAdmin("admin", "azerty", "@cesi.com");
        admin.justLoginEmail(); 

        User utilisateur = new User ("tom", "123", 30, "@cesi.com");
        utilisateur.fullInfos();
        

        
    }
}

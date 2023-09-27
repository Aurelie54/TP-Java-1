public class User {
    public String login;
    public String password;
    public int age;
    public String email;

    public User(String login, String password, int age, String email) {
        this.login = login;
        this.password = password;
        this.age = 18;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

        public String getEmail() {
        return email;
    }

    public void fullInfos() {
        System.out.println(login + email + " " + age + " " + "ans");

    }

        public void justLoginEmail() {
        System.out.println(login + email);

    }
    
}

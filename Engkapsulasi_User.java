package Engkapsulasi_User;

public class Engkapsulasi_User {

    public static void main(String[] args) {

        User Zyy = new User("Zyy","Okayy",1,true);

        Zyy.setUsername("Marc Zyy.");
        Zyy.setPassword("Chaser234");
        Zyy.setId(45621221);
        Zyy.setStatus(true);
        

        System.out.println("Username: " + Zyy.getUsername());
        System.out.println("Password: " + Zyy.getPassword());
        System.out.println("ID : " + Zyy.getId());
        System.out.println("Status : " + Zyy.Getstatus());
        
        
    }

}

package src.builder;

public class Client {

    public static void main(String[] args) {
        User u1 = new User.UserBuilder().setEmpId(1).setEmpName("Papun").setEmpSal(10000.0).build();
        System.out.println(u1);
    }
}

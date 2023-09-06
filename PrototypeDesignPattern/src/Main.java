// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void fillRegistery(UserRegistery u){
        User u1= new User("Test1","Test@gmail",26);
        u.register("SuperUser",u1);
        User u2= new User("Test2","Test@gmail",28);
        u.register("CustomerUser",u2);
    }
    public static void main(String[] args) {
        UserRegistery reg= new UserRegistery();
        fillRegistery(reg);

        User u1= reg.getRegistery("SuperUser");
        User u2=u1.Clone();
        u2.setName("p1");

        User u3= reg.getRegistery("CustomerUser");
        User u4=u3.Clone();
        u4.setName("p2");
    }
}
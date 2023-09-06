// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student s=new Student.Builder().setName("Shivani").setAge(26).setAddress("Test").setPSP(98).setEmail("Test@gmail.com").CreateBuilder();
        Student s1=new Student.Builder().setName("Shivani").setAge(26).setAddress("Test").setPSP(101).setEmail("Test@gmail.com").CreateBuilder();
    }
}
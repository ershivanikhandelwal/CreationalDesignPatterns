// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IButtonAbstract roundButton= new RoundButtonFactory();
        Button rb=roundButton.createInstance(1,2,0,0);
        rb.Runner();
    }
}
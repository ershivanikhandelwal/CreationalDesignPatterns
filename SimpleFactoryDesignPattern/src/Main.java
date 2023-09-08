// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FactoryParameters fact=new FactoryParameters.Builder().setBorder(1.2).setLength(1.1).setScreen(ScreenSize.MOBILE).Build();
        Button button= ButtonFactory.CreateButton(fact);
        button.render();
        button.onClick();
    }
}
public class DarkThemeFactory implements IThemeFactory{
    @Override
    public InputBox CreateInputBox() {
        return new DarkInput();
    }

    @Override
    public Button CreateButton() {
        return new DarkButton();
    }
}

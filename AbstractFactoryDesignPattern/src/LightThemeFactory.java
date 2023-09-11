public class LightThemeFactory implements IThemeFactory{
    @Override
    public InputBox CreateInputBox() {
        return new LightInput();
    }

    @Override
    public Button CreateButton() {
        return new LightButton();
    }
}

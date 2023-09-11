public class RoundButtonFactory implements IButtonAbstract {
    @Override
    public Button createInstance(int b, int l, int br, int r) {
        return new RoundButton(r, b);
    }
}

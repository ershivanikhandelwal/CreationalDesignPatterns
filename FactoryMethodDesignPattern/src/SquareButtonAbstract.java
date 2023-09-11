public class SquareButtonAbstract implements IButtonAbstract{
    @Override
    public Button createInstance(int b, int r, int br, int l) {
        return new SquareButton(l,br,b);
    }
}

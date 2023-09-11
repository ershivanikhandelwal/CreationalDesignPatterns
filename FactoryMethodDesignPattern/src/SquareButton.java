public class SquareButton extends Button{
    public int length;
    public int bredth;
    public SquareButton(int l, int br, int b){
        super(b);
        this.length=l;
        this.bredth=br;
    }
    @Override
    public void Runner() {
        System.out.println("Runner from Square button");
    }
}

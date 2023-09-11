public class RoundButton extends Button{
    public int radius;
    public RoundButton(int r, int b){
        super(b);
        this.radius=r;
    }
    @Override
    public void Runner() {
        System.out.println("Runner from round button");
    }
}

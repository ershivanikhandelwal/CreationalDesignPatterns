public class SquareButton extends Button {
    public double length;
    public SquareButton(double border, double length){
        super(border);
        this.length=length;
    }
    @Override
    public void onClick() {
        System.out.println("Clicked from square button");
    }

    @Override
    public void render() {
        System.out.println("Render from square");
    }
}

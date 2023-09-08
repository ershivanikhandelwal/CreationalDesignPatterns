public class RoundButton extends Button {
    public double radius;
    public RoundButton(double radius, double border){
        super(border);
        this.radius=radius;
    }
    @Override
    public void onClick() {
        System.out.println("clicked from round");
    }

    @Override
    public void render() {
        System.out.println("Rendered from round");
    }
}

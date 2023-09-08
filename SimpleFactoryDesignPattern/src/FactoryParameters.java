import lombok.Getter;

@Getter
public class FactoryParameters {
    private double length;
    private double border;
    private double radius;
    private ScreenSize type;
    private FactoryParameters(Builder b){
        this.length=b.length;
        this.border=b.border;
        this.radius=b.radius;
        this.type=b.type;
    }
    public static class Builder{
        private double length;
        public Builder setLength(double l){
            this.length=l;
            return this;
        }
        private double border;
        public Builder setBorder(double b){
            this.border=b;
            return this;
        }
        private double radius;
        public Builder setRadius(double l){
            this.radius=l;
            return this;
        }
        private ScreenSize type;
        public Builder setScreen(ScreenSize l) {
            this.type = l;
            return this;
        }

        public FactoryParameters Build(){
            return new FactoryParameters(this);
        }
    }
}

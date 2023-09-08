public class ButtonFactory {
    public static Button CreateButton(FactoryParameters param){
        switch(param.getType()){
            case MOBILE : return new RoundButton(param.getRadius(),param.getBorder());
            case PHONE : return new SquareButton(param.getBorder(), param.getLength());
            case TABLET : return new TriangleButton(param.getLength());
        }
        throw new RuntimeException("no implementation");
    }
}

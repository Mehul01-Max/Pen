public class GelPen extends Pen {

    public GelPen(String color, OpenCloseStrategy openCloseStrategy) {
        super("Gel", color, openCloseStrategy);
    }

    @Override
    String getWritingStyle() {
        return "gel";
    }

}

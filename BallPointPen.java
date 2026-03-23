
public class BallPointPen extends Pen {

    public BallPointPen(String color, OpenCloseStrategy openCloseStrategy) {
        super("BallPoint", color, openCloseStrategy);
    }

    @Override
    String getWritingStyle() {
        return "Rolling ball";
    }
}


public class PenFactory {

    public static Pen createPen(String type, String color, String mechanism) {
        OpenCloseStrategy openCloseStrategy = createStrategy(mechanism);

        if (type.equalsIgnoreCase("BallPoint")) {
            return new BallPointPen(color, openCloseStrategy);
        } else if (type.equalsIgnoreCase("Gel")) {
            return new GelPen(color, openCloseStrategy);
        } else if (type.equalsIgnoreCase("Ink")) {
            return new InkPen(color, openCloseStrategy);
        }
        throw new IllegalArgumentException(type + " mechanism doesn't exist.");
    }

    private static OpenCloseStrategy createStrategy(String mechanism) {
        if (mechanism == "cap") {
            return new CapStrategy();
        } else if (mechanism == "click") {
            return new ClickStrategy();
        }
        throw new IllegalArgumentException(mechanism + " mechanism doesn't exist.");
    }
}
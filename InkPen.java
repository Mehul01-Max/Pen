public class InkPen extends Pen {

    public InkPen(String color, OpenCloseStrategy openCloseStrategy) {
        super("Ink", color, openCloseStrategy);
    }

    @Override
    String getWritingStyle() {
        return "Nib based fine stroke";
    }

    public void refill(String color) {
        this.color = color;
        this.inkLevel = 100;
        System.out.println("Replacing ink cartridge for " + type + " pen with " + this.color + " ink... ");
        System.out.println("Ink refilled to 100%");
    }

}

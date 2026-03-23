
public abstract class Pen {

    String color;
    String type;
    int inkLevel;
    boolean isOpen;
    OpenCloseStrategy openCloseStrategy;

    public Pen(String type, String color, OpenCloseStrategy openCloseStrategy) {
        this.type = type;
        this.color = color;
        this.openCloseStrategy = openCloseStrategy;
        this.isOpen = false;
        this.inkLevel = 100;
    }

    public void start() {
        if (isOpen) {
            System.out.println(type + " pen is already open.");
            return;
        }
        openCloseStrategy.open();
        isOpen = true;
        System.out.println("Pen is ready to write");
    }

    public void close() {
        if (!isOpen) {
            System.out.println(type + " pen is already closed.");
            return;
        }

        openCloseStrategy.close();
        isOpen = false;
        System.out.println("Pen is closed.");
    }

    public void write(String content) {
        if (!this.isOpen) {
            System.out.println("Error: Please start the pen before writing");
            return;
        }
        if (inkLevel <= 0) {
            System.out.println("Error: Ink is Empty please refill the pen.");
            return;
        }
        System.out.println("[" + type + " | " + color + " | " + getWritingStyle() + "] Writing: " + content);
    }

    abstract String getWritingStyle();

    public void refill(String color) {
        this.color = color;
        inkLevel = 100;
        System.out.println("Refilling " + type + " pen with " + this.color + " ink... ");
        System.out.println("Ink refilled to 100%");
    }
}

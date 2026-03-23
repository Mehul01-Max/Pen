
public class CapStrategy implements OpenCloseStrategy {

    public void open() {
        System.out.println("Removed the cap...");
    }

    public void close() {
        System.out.println("Putting the cap back on");
    }
}
public class ClickStrategy implements OpenCloseStrategy {

    public void open() {
        System.out.println("Clicking the pen open...");
    }

    public void close() {
        System.out.println("Clicking the pen close...");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== BallPoint Pen (Click) ===");
        Pen ballPoint = PenFactory.createPen("ballpoint", "Blue", "click");
        System.out.println(ballPoint);
        ballPoint.start();
        ballPoint.write("Hello, World!");
        ballPoint.write("Design Patterns are great.");
        ballPoint.close();
        System.out.println();

        System.out.println("=== Gel Pen (Cap) ===");
        Pen gelPen = PenFactory.createPen("gel", "Black", "cap");
        System.out.println(gelPen);
        gelPen.start();
        gelPen.write("Smooth gel writing.");
        gelPen.refill("Black");
        gelPen.write("Writing after refill.");
        gelPen.close();
        System.out.println();

        System.out.println("=== Ink Pen (Cap) ===");
        Pen inkPen = PenFactory.createPen("ink", "Red", "cap");
        System.out.println(inkPen);
        inkPen.start();
        inkPen.write("Fine nib strokes.");
        inkPen.refill("Red");
        inkPen.write("Writing after cartridge replacement.");
        inkPen.close();
        System.out.println();
    }

}

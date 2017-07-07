/**
 * Created by ac003588 on 7/7/2017.
 */
public class main {
    public static void main(String[] args) {

        Printer lp1 = new Printer();
        // System.out.println("Toner Level is: " + lp1.getTonerLevel());

        lp1.print(10);
        // System.out.println("Toner Level is: " + lp1.getTonerLevel());

        lp1.pushMaintButton();

        lp1.print(50);
        lp1.print(60);
        lp1.print(90);
    }
}

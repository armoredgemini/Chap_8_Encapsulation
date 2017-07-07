import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

import javax.xml.bind.SchemaOutputResolver;


import java.util.Scanner;
/**
 * Created by ac003588 on 7/7/2017.
 */



public class Printer {

Scanner reader = new Scanner(System.in);
    private int tonerLevel = 100;
    private int pagesPrinted;

    private void fillToner(int addLevel) {
        // if passed toner level plus current toner level is greater than 0 and greater than or equal to 100, then fill to 100
        if (tonerLevel + addLevel > 100) {
            tonerLevel = 100;
        } else {
            tonerLevel = tonerLevel + addLevel;
        }
        System.out.println("Toner increased by " + addLevel + " to: " + tonerLevel);
    }

    public void print(int pages) {
        System.out.println(System.lineSeparator() + pages + " queued for printing");
        if (tonerLevel > pages ) {
            System.out.println(System.lineSeparator() + pages + " pages printed");
            tonerLevel = tonerLevel - pages;
            pagesPrinted = pagesPrinted + pages;
        } else {
            System.out.println("Not enough toner to print pages: " + pages);
            pushMaintButton();
        }
        if (tonerLevel < 10) {
            System.out.println("Toner level low! Level: " + tonerLevel);
        }
    }

    public void pushMaintButton() {
        System.out.println("Maintenance Selected" + System.lineSeparator() + "Options: 1: Fill Toner" + System.lineSeparator() +
                "\t\t 2: Get Toner Level" + System.lineSeparator() +
                "\t\t 3: Clean Nozzle" + System.lineSeparator() +
                "\t\t 4: Total Pages Printed " + System.lineSeparator());
        String option = reader.next();
        int n = Integer.parseInt(option);
        switch(n) {
            case 1:
                System.out.println("Please enter amount to fill: ");
                String t = reader.next();
                int amount = Integer.parseInt(t);
                fillToner(amount);
                break;
            case 2:
                System.out.println("Toner Level is: " + tonerLevel);
                break;
            case 3:
                System.out.println("Nozzles have been cleaned");
                break;
            case 4:
                System.out.println("Total pages printed: " + pagesPrinted);
        }
    }


}

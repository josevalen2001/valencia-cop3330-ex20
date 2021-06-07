package base;
import java.text.DecimalFormat;
import java.util.*;

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("#.00");

        //Input
        System.out.print("What is the order amount? ");
        int amount = Integer.parseInt(newScan.nextLine());

        System.out.print("What state do you live in? ");
        String state = newScan.nextLine();

         String county = "";
        if(state.equals("Wisconsin")) {
            System.out.print("What county do you live in? ");
            county = newScan.nextLine();
        }

        //Procedure
        double tax = 0;
        if (state.equals("Wisconsin"))
        {
            tax = amount * 0.05;

            if(county.equals("Eau Claire"))
                tax += amount * 0.005;
            else if (county.equals("Dunn"))
                tax += amount * 0.004;
        }
        else if(state.equals("Illinois"))
            tax = amount * 0.08;
        else
            tax = 0;

        double total = amount + tax;

        System.out.println("The tax is $" + numFormat.format(tax) + ".");
        System.out.println("The total is $" + numFormat.format(total) + ".");
    }

}

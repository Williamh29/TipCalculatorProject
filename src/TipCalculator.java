import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    public static void main(String []args){
        Scanner scan = new Scanner (System.in);
        DecimalFormat formatter = new DecimalFormat ("#.##");
        System.out.println("Welcome to the Tip Calculator!"); //welcomes user
        System.out.print("How many people are in your group? "); //user inputs number
        int people = scan.nextInt();
        System.out.print("What’s the tip percentage? (0-100): "); //enter any number without percentage
        int percent = scan.nextInt(); //user enters the percentage for tips
        double total = 0;
        double num = 0;
        System.out.print("Enter a cost in dollars and cents, (-1 to end) : "); //typing -1 will stop asking for you to enter money and skip to giving you the receipt or "totals"
        num = scan.nextDouble(); //user enters the amount for the things bought
        while (num != -1) {
            total = total + num;
            System.out.print("Enter a cost in dollars and cents, (-1 to end) : ");
            num = scan.nextDouble();
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        String formattedNum = formatter.format(total);
        System.out.println("Total Bill Before Tip : " + formattedNum );
        System.out.println("Tip Percentage : " + percent+"%"); //whole number inputted and not the percentage inputted with the current whole.
        double totaltip = total * percent / 100; //divided by 100 because the percent entered is whole number(20) rather than the percent added like 1.20.
        String formattedtotaltip = formatter.format(totaltip);
        System.out.println("Total Tip : "+formattedtotaltip);
        double totalbill = total + totaltip;
        String formattedtotalbill = formatter.format(totalbill);
        System.out.println("Total Bill With Tip: "+ formattedtotalbill);
        double costbeforetip= total/people;
        String formattedpeople = formatter.format(costbeforetip);
        System.out.println("Per Person Cost Before Tip: " +formattedpeople);
        double TipPerPerson = totaltip/people; //tip paid per person not including the total without tips
        String formattedTPP = formatter.format(TipPerPerson);
        System.out.println("Tip Per Person: " + formattedTPP);
        double TotalCostPerPerson = TipPerPerson+costbeforetip;
        String formattedTCPP = formatter.format(TotalCostPerPerson);
        System.out.println("Total Cost Per Person: " + formattedTCPP); //end value for each person
    }
}
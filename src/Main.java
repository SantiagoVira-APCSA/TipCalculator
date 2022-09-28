import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Setup
        Scanner input = new Scanner(System.in);

        // Get values from user
        System.out.print("How much is the bill? ");
        double totalBill = input.nextDouble();
        System.out.print("How much would you like to tip (in percentage, ex. 20)? ");
        double tipPercentage = input.nextDouble();
        System.out.print("How many people are there? ");
        int numPeople = input.nextInt();

        // Calculate total tip
        double totalTip = totalBill * (tipPercentage / 100);

        // Calculate values per person
        double tipPerPerson = totalTip / numPeople;
        double billAmountPerPerson = totalBill / numPeople;
        double totalPerPerson = tipPerPerson + billAmountPerPerson;

        // Format output variables
        String tipPerPersonFormatted = String.format("%.2f",tipPerPerson);
        String billPerPersonFormatted = String.format("%.2f",billAmountPerPerson);
        String totalPerPersonFormatted = String.format("%.2f",totalPerPerson);

        // Output values to user
        System.out.println("Each person will pay $" + billPerPersonFormatted +
                " for the bill and will tip $" +
                tipPerPersonFormatted + "For a total of $" + totalPerPersonFormatted + " per person.");
    }
}
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculate {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Loans myloan = new Loans();

        myloan.setAnnualInterestRate(input);
        myloan.setNumberOfYears(input);
        myloan.setLoanAmount(input);

        System.out.println("The loan was created on " + myloan.getLoanDate());
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("The monthly payment is  " + df.format(myloan.getMonthlyPayment()));
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("The total payment is " + df.format(myloan.getTotalPayment()));



    }
}

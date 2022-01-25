import java.util.Date;
import java.util.Scanner;

public class Loans {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loans(){
        this (2.5, 1, 1000);
    }

    public Loans(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    //getter and setter for annual interest rate
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(Scanner scan){
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        this.annualInterestRate = scan.nextDouble();
    }

    //Getter and setter for number of years
    public int getNumberOfYears() {
        return numberOfYears;
    }

      public void setNumberOfYears(Scanner scan){
        System.out.print("Enter number of years as an integer: ");
        this.numberOfYears = scan.nextInt();
    }

    //Getter and setter for loan amount
    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Scanner scan) {
        System.out.print("Enter loan amount, for example, 120000.95: ");
        this.loanAmount = scan.nextDouble();
    }
  
    //Get date
    public Date getLoanDate() {
        return loanDate;
    }
 
    //find the monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
          (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;    
    }
    
      //find the total payment
      public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;    
    }
  
}

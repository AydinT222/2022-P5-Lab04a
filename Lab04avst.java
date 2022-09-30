// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 100 Point Version\n");

        double principal    = 250000;
        double annualRate   = 4.85;
        double numYears     = 30;

        // below is only for monthlyPay
        double monthlyRate  = (annualRate / 100) / 12; // 0.004...
        double numMonths    = numYears * 12; // 360.0
        // top is only for monthlyPay

        double numerator = (monthlyRate * Math.pow((1 + monthlyRate), numMonths));
        double denominator = (Math.pow((1 + monthlyRate), numMonths) - 1);

        double monthlyPay = (numerator / denominator) * principal;

        double totalPayment = monthlyPay * numMonths;
        double totalInterest = totalPayment - principal;

        // the casting part looks terrible
        System.out.println("Principal:\t\t\t$" + principal);
        System.out.println("Annual Rate:\t\t" + annualRate + "%");
        System.out.println("Number of Years:\t" + numYears);
        System.out.println("Monthly Payment:\t" + (double)(Math.round(monthlyPay * 100)) / 100); // sorry
        System.out.println("Total Payments:\t\t" + (double)(Math.round(totalPayment * 10)) / 10); //474922.8
        System.out.println("Total Interest:\t\t" + (double)((int)(totalInterest * 10)) / 10); //224922.8
        // THIS IS NOT PRINTING OUT .8 AND ONLY .6 how did the lab get .8

        System.out.println();
    }
}


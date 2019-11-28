import java.text.DecimalFormat;
import java.util.*;
class Account
{
    Account(int id, double balance,double interestRate)
    {
        this.id=id;
        this.balance=balance;
        this.interestRate=interestRate;
    }
    int id;
    double balance;
    double interestRate;
}
 class Solution
{
    static double calculateInterest(Account ac, int noOfYears)
    {
        double percentage = (noOfYears *ac.interestRate)/100;
        double newInterest = ac.interestRate+percentage;
        double interest = (ac.balance * newInterest)/100;
        //DecimalFormat df = new DecimalFormat("#0.000");
        //return df.format(interest);
        return interest;
    }
    public static void main(String[] args)throws Exception
    {
        Scanner sc= new Scanner(System.in);
        int id=sc.nextInt();
        double balance=sc.nextDouble();
        double interestRate=sc.nextDouble();
        int noOfYears=sc.nextInt();
        Account ac = new Account(id,balance,interestRate);
        System.out.format("%.3f",calculateInterest(ac,noOfYears));

        
    }
}
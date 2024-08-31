public class BudgetCalculatorProject
{
    public static void main(String [] args)
    {
        final double SALARY = 4000.0;
        final double SAVINGS_PERCENT = 0.1;
        final double RENT_PERCENT = 0.3;
        final double GROCERIES_PERCENT = 0.15;
        final double ENTERTAINMENT_PERCENT = 0.1;
        double monthlySalary = SALARY;
        double savedAmount = monthlySalary * SAVINGS_PERCENT;
        double rentAmount = monthlySalary * RENT_PERCENT;
        double groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        double entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        double remainingBalance = monthlySalary - totalExpenses;
        System.out.println("Monthly Salary is " + monthlySalary);
        System.out.println("Amount saved is " + savedAmount);
        System.out.println("Amount spent on rent is " + rentAmount);
        System.out.println("Amount spent on groceries is " + groceriesAmount);
        System.out.println("Amount spent on entertainment is "+ entertainmentAmount);
        System.out.println("Total expenses are " + totalExpenses);
        System.out.println("Remaining balance is " + remainingBalance);
    }
}
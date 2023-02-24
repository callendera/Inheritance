public class SalaryWorker extends Worker {

    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String Title, int YOB, int age, double annualSalary) {
        super(firstName, lastName, ID, Title, YOB, age, 12.22);
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52.0;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
         System.out.println(getFirstName() + " is a salary worker and earns " + calculateWeeklyPay(0) +
                " per week, which is a fraction of their annual salary of " + annualSalary);
        return null;
    }

    public void displayWeeklyPay() {
    }
}

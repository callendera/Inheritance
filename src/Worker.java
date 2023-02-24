public class Worker extends Person {

    private double hourlyPayRate;


    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                super.toString() +
                " hourlyPayRate=" + hourlyPayRate +
                "}";
    }

    public Worker(String firstName, String lastName, String ID, String title, int YOB, int age, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB, age);
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(Person person, double hourlyPayRate) {
        super(person.getID(), person.getFirstName(), person.getLastName(), person.getTitle(), person.getYOB());
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(hoursWorked, 40) * hourlyPayRate;
        double overtimePay = Math.max(hoursWorked - 40, 0) * hourlyPayRate * 1.5;
        return regularPay + overtimePay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(hoursWorked - 40, 0);
        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * hourlyPayRate * 1.5;
        double totalPay = regularPay + overtimePay;
        return String.format("Regular hours: %.1f, Regular pay: $%.2f, Overtime hours: %.1f, Overtime pay: $%.2f, Total pay: $%.2f",
                regularHours, regularPay, overtimeHours, overtimePay, totalPay);
    }
}

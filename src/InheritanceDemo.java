import java.util.ArrayList;


public class InheritanceDemo {
    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();

        Worker w1 = new Worker("Phyllis", "Vance", "4", "Mrs.", 1985, 38, 25.50);
        Worker w2 = new Worker("Pam", "Halpert", "5", "Mrs.", 1995, 28, 22.22);
        Worker w3 = new Worker("Toby", "Flenderson", "6", "Dr.", 1975, 48, 2.22);

        workers.add(w1);
        workers.add(w2);
        workers.add(w3);

        SalaryWorker sw1 = new SalaryWorker("Michael", "Scott", "7", "Mr.", 1985, 38, 155000);
        SalaryWorker sw2 = new SalaryWorker("Dwight", "Shrute", "8", "Esq.", 1995, 28, 55000);
        SalaryWorker sw3 = new SalaryWorker("Lloyd", "Gross", "9", "Dr.", 1965, 58, 200000);

        workers.add(sw1);
        workers.add(sw2);
        workers.add(sw3);

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay");

            System.out.printf("%-10s %-10s %-10s%n", "Name", "Type", "Pay");

            for (Worker worker : workers) {
                double pay = 0.0;

                if (week == 1) {
                    pay = worker.calculateWeeklyPay(40);
                } else if (week == 2) {
                    pay = worker.calculateWeeklyPay(50);
                } else {
                    pay = worker.calculateWeeklyPay(40);
                }

                System.out.printf("%-10s %-10s $%-9.2f%n", worker.getFirstName(), worker instanceof SalaryWorker ? "Salary" : "Hourly", pay);
            }

            System.out.println();
        }
    }
}

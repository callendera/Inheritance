import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryWorkerTest {

    public static void main(String[] args) {
        SalaryWorker salaryWorker = new SalaryWorker("John", "Smith", "567890", "Mr.", 1994, 29, 12300.00);
        salaryWorker.displayWeeklyPay();
    }

    SalaryWorker s1, s2, s3, s4;

    @BeforeEach
    void setUp(){
        s1 = new SalaryWorker ("Bob", "Williams", "345678", "Mr.", 1955, 68, 155000);
        s2 = new SalaryWorker ("Stella", "Browder", "123456", "Mz.", 1945, 78, 78000);
        s3 = new SalaryWorker ("Rose", "Petal", "789456", "Dr.", 1999, 24, 50000);
        s4 = new SalaryWorker ("Kendrick", "Lamar", "123789", "Esq.", 1994, 29, 200000);
    }

    @Test
    void calculateWeeklyPay() {
        s1.calculateWeeklyPay(40);
        assertEquals(2980.769230769231, s1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        s2.displayWeeklyPay(40);
        assertEquals(null, s2.displayWeeklyPay(40));
    }
}
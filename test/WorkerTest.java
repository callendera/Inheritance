import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorkerTest {

    Worker w1, w2, w3, w4;

    @BeforeEach
    void setUp(){
        w1 = new Worker ("Bob", "Williams", "345678", "Mr.", 1955, 68, 12.22);
        w2 = new Worker ("Stella", "Browder", "123456", "Mz.", 1945, 78, 12.22);
        w3 = new Worker ("Rose", "Petal", "789456", "Dr.", 1999, 24, 12.22);
        w4 = new Worker ("Kendrick", "Lamar", "123789", "Esq.", 1994, 29, 12.22);
    }

    @Test
    void calculateWeeklyPay() {
        w1.calculateWeeklyPay(40);
        assertEquals(488.8, w1.calculateWeeklyPay(40));
    }

    @Test
    void displayWeeklyPay() {
        w2.displayWeeklyPay(45);
        assertEquals("Regular hours: 40.0, Regular pay: $488.80, Overtime hours: 5.0, Overtime pay: $91.65, Total pay: $580.45", w2.displayWeeklyPay(45));
    }
}


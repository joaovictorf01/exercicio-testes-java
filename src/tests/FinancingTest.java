package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import entities.Financing;
import static org.junit.jupiter.api.Assertions.*;

public class FinancingTest {

    private Financing financing;
    private double totalAmount;
    private double income;
    private int months;

    @BeforeEach
    public void setup() {
        totalAmount = 100000.0;
        income = 5000.0;
        months = 80;
        financing = new Financing(totalAmount, income, months);
    }

    @Test
    public void shouldCreateObjectWithValidData() {
        assertEquals(totalAmount, financing.getTotalAmount());
        assertEquals(income, financing.getIncome());
        assertEquals(months, financing.getMonths());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnInvalidDataInConstructor() {
        double totalAmount = 100000.0;
        double income = 200.0;
        int months = 80;

        assertThrows(IllegalArgumentException.class, () -> new Financing(totalAmount, income, months));
    }

    @Test
    public void shouldUpdateTotalAmountWithValidData() {
        double newTotalAmount = 200000.0;
        financing.setTotalAmount(newTotalAmount);
        assertEquals(newTotalAmount, financing.getTotalAmount());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnInvalidTotalAmount() {
        assertThrows(IllegalArgumentException.class, () -> financing.setTotalAmount(500000.0));
    }

    @Test
    public void shouldUpdateIncomeWithValidData() {
        double newIncome = 6000.0;
        financing.setIncome(newIncome);
        assertEquals(newIncome, financing.getIncome());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnInvalidIncome() {
        assertThrows(IllegalArgumentException.class, () -> financing.setIncome(300.0));
    }

    @Test
    public void shouldUpdateMonthsWithValidData() {
        int newMonths = 90;
        financing.setMonths(newMonths);
        assertEquals(newMonths, financing.getMonths());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnInvalidMonths() {
        assertThrows(IllegalArgumentException.class, () -> financing.setMonths(12));
    }

    @Test
    public void shouldCorrectlyCalculateEntry() {
        assertEquals(totalAmount * 0.2, financing.entry());
    }

    @Test
    public void shouldCorrectlyCalculateQuota() {
        assertEquals((totalAmount - financing.entry()) / months, financing.quota());
    }

}

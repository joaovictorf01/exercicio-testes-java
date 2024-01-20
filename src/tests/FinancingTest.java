package tests;

import org.junit.jupiter.api.Test;

import entities.Financing;

import static org.junit.jupiter.api.Assertions.*;

public class FinancingTest {

    @Test
    public void shouldCreateObjectWithValidData() {
        double totalAmount = 100000.0;
        double income = 5000.0;
        int months = 80;
        Financing financing = new Financing(totalAmount, income, months);
        assertEquals(totalAmount, financing.getTotalAmount());
        assertEquals(income, financing.getIncome());
        assertEquals(months, financing.getMonths());

    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnInvalidDataInConstructor() {
        double totalAmount = 100000.0;
        double income = 5000.0;
        int months = 20;
        assertThrows(IllegalArgumentException.class, () -> new Financing(totalAmount, income, months));
    }

    @Test
    public void shouldUpdateTotalAmountWithValidData() {
        double totalAmount = 100000.0;
        double income = 5000.0;
        int months = 80;
        Financing financing = new Financing(totalAmount, income, months);
        double newTotalAmount = 200000.0;
        financing.setTotalAmount(newTotalAmount);
        assertEquals(newTotalAmount, financing.getTotalAmount());

    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnInvalidTotalAmount() {




    }

    public void shouldUpdateIncomeWithValidData() {
    


    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnInvalidIncome() {

    }

    @Test
    public void shouldUpdateMonthsWithValidData() {
        // Test: Deve atualizar o valor quando os dados forem válidos para setMonths
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionOnInvalidMonths() {
        // Test: Deve lançar IllegalArgumentException quando os dados não forem válidos
        // para setMonths
    }

    @Test
    public void shouldCorrectlyCalculateEntry() {
        // Test: Deve calcular corretamente o valor da entrada
    }

    @Test
    public void shouldCorrectlyCalculateQuota() {
        // Test: Deve calcular corretamente o valor da prestação
    }
}

package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenDataIsValid(){
        Financing financing = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(100000.0, financing.getTotalAmount());
        Assertions.assertEquals(2000.0, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());
    }

    @Test
    public void constructorShouldThrowsIllegalArgumentExceptionWhenDataNotIsValid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 10);
        });
    }

    @Test
    public void setTotalAmountShouldUpdateValueWhenDataIsValid(){

        Financing financing = new Financing(100000.0, 2000.0, 80);

        financing.setTotalAmount(80000.0);

        Assertions.assertEquals(80000.0, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowsExceptionsWhenDataIsNotValid(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);

            financing.setTotalAmount(200000.0);
        });
    }

    @Test
    public void setIncomeShouldUpdateValueWhenValueIsValid(){

        Financing financing = new Financing(100000.0, 2000.0, 80);

        financing.setIncome(3000.0);

        Assertions.assertEquals(3000.0, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowsIllegalArgumentExceptionWhenDataNotIsValid(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);

            financing.setIncome(1000.0);
        });
    }

    @Test
    public void setMonthsShouldUpdateValueWhenValueIsValid(){
        Financing financing = new Financing(100000.0, 2000.0, 80);

        financing.setMonths(81);

        Assertions.assertEquals(81, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowsIllegalArgumentExceptionWhenValueIsNotValid(){

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);

            financing.setMonths(70);
        });
    }

    @Test
    public void entryShouldCalculateEntryCorrectly(){
        Financing financing = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(20000.0, financing.entry());
    }

    @Test
    public void quotaShouldCorrectlyCalculateQuota(){
        Financing financing = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(1000.0, financing.quota());

    }

}

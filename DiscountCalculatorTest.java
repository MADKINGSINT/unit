import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {

    @Test
    public void testCalculateDiscountWithValidArguments() {
        double purchaseAmount = 100.0;
        double discountPercentage = 20.0;

        double expectedDiscountedAmount = 80.0;
        
        DiscountCalculator calculator = new DiscountCalculator();
        double actualDiscountedAmount = calculator.calculateDiscount(purchaseAmount, discountPercentage);
        
        Assertions.assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }
    
    @Test
    public void testCalculateDiscountWithInvalidArguments() {
        double purchaseAmount = -100.0;
        double discountPercentage = 20.0;

        DiscountCalculator calculator = new DiscountCalculator();
        
        Assertions.assertThatThrownBy(() -> calculator.calculateDiscount(purchaseAmount, discountPercentage))
                .isInstanceOf(ArithmeticException.class);
    }
}

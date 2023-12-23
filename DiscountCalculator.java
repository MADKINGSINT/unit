public class DiscountCalculator {
    public static void main(String[] args) {
        
    }
        public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0) {
            throw new ArithmeticException("Purchase amount cannot be negative");
        }
        
        return purchaseAmount - (purchaseAmount * discountPercentage / 100);
    }

}

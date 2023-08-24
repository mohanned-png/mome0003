

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculateNewPrice(double originalPrice) {
        return originalPrice;
    }
}
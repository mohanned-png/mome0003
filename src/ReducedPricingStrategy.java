

public class ReducedPricingStrategy implements PricingStrategy {
    private double percentage;

    public ReducedPricingStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateNewPrice(double originalPrice) {
        return originalPrice * (1 - percentage);
    }
}
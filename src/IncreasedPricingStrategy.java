

public class IncreasedPricingStrategy implements PricingStrategy {
    private double percentage;

    public IncreasedPricingStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double calculateNewPrice(double originalPrice) {
        return originalPrice * (1 + percentage);
    }

}
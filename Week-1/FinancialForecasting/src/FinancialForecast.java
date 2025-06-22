public class FinancialForecast {

    public static double predictFutureValue(int years, double currentValue, double growthRate) {

        if (years == 0) {
            return currentValue;
        }

        return predictFutureValue(years - 1, currentValue, growthRate) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Starting amount
        double growthRate = 0.10; // 10% growth per year
        int years = 5;

        double result = predictFutureValue(years, initialValue, growthRate);

        System.out.println("Future value after " + years + " years: ₹" + result);
    }
}

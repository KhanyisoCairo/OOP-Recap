interface CalculationStrategy {

    int calculate(int a, int b);

    class Add implements CalculationStrategy {
        public int calculate(int a, int b) {
            return a + b;
        }
    }

    class Minus implements CalculationStrategy {
        public int calculate(int a, int b) {
            return a - b;
        }
    }

    class PowerOff implements CalculationStrategy {
        public int calculate(int a, int b) {
            return (int) Math.pow(a, b);
        }
    }
}

class TheCalculator {

    CalculationStrategy calculationStrategy;

    public void setCalculationStrategy(CalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public int calculate(int a, int b) {
        return this.calculationStrategy.calculate(a, b);
    }

//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public int subtract(int a, int b) {
//        return a - b;
//    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        TheCalculator calculator = new TheCalculator();

        calculator.setCalculationStrategy(new CalculationStrategy.PowerOff());
        System.out.println(calculator.calculate(4, 7));
//        System.out.println(calculator.add(4, 7));
//        System.out.println(calculator.subtract(4, 7));

    }
}

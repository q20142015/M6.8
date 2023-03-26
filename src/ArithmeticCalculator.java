public class ArithmeticCalculator {
    private double a;
    private double b;

    ArithmeticCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(Operation operation) {
        if (operation == Operation.ADD) {
            return a + b;
        } else if (operation == Operation.SUBTRACT) {
            return a - b;
        } else {
            return a * b;
        }

    }
}

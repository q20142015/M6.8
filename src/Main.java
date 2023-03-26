public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Silk", 40);
        basket.print("Milk");

        Basket basket1 = new Basket();
        basket1.add("Milk", 40);

        double a=Basket.srStKorzin();
        double b=Basket.srPrice();

        System.out.println(a);
        System.out.println(b);

        ArithmeticCalculator ac=new ArithmeticCalculator(1.3,2.3);
        System.out.println(ac.calculate(Operation.ADD));
        System.out.println(ac.calculate(Operation.MULTIPLY));
        System.out.println(ac.calculate(Operation.SUBTRACT));
        System.out.println(ac.calculate(Operation.ADD));
        System.out.println(ac.calculate(Operation.MULTIPLY));
        System.out.println(ac.calculate(Operation.SUBTRACT));

    }
}

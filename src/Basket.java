public class Basket {

    private static int count = 0;
    private static double totalPriceAll = 0;
    private static double totalCountAll = 0;
    private String items = "";
    private int totalPrice = 0;
    private static int allBasket = 0;
    private int limit;


    public Basket() {
        increaseCount(0);
        allBasket += 1;
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        increaseTotalCount(1) ;
        increaseTotalPriceAll(totalPrice);
    }

    public static int getCount() {
        return count;
    }

    public static void increaseTotalCount(int count) {
        totalCountAll = totalCountAll+ count;
    }
    public static void increaseTotalPriceAll(double price) {
        totalPriceAll = totalPriceAll + price;
    }
    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }
    public static double srPrice() {
        return totalPriceAll/totalCountAll;
    }
    public static double srStKorzin() {
        return totalPriceAll/allBasket;
    }


    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        increaseTotalCount(count) ;
        increaseTotalPriceAll(count * price);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}

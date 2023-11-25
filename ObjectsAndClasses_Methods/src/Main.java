public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 2, 0.9);
        basket.add("Coffee", 300);
        basket.add("Apple", 32, 7,0.05);
        basket.print("Vanya's basket");

        System.out.println("\nИтог: " + basket.getTotalPrice() + " руб.");
        System.out.println("Вес корзины: " + basket.getTotalWeight() + " кг.");
    }
}

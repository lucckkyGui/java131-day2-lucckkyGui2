package ex24;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        removeFromBasket(basket);
        removeFromBasket(basket);
        removeFromBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        addToBasket(basket);
        removeFromBasket(basket);
        System.out.println(basket);
    }

    private static void removeFromBasket(Basket basket) {
        try {
            basket.removeToBasket();
        } catch (BasketEmptyException e) {
            System.out.println("Cokolwiek");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Wykonam się zawsze :)");
        }
    }
    private static void addToBasket(Basket basket) {
        try {
            basket.addToBasket();
        } catch (BasketFullException e) {
            System.out.println("Zamiast tego cokolwiek");
            System.out.println(e.getMessage());
        }
    }
}

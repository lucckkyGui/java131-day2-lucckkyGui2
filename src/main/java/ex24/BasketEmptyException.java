package ex24;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException() {
        super("Uzupełnij koszyk");
    }

    public BasketEmptyException(String message) {
        super(message);
    }
}

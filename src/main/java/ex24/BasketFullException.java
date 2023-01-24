package ex24;

public class BasketFullException extends RuntimeException{ //zdefiniowany wyjątek, zatrzymuje dalsze wywoływanie działania
    public BasketFullException() {
        super("Twój koszyk jest przepełniony");
    }

    public BasketFullException(String message) {
        super(message);
    }
}

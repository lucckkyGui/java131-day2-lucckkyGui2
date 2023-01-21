package ex12;

import java.math.BigDecimal;
import java.time.Year;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Ford", Year.of(2004), "USA");
        Manufacturer manufacturer2 = new Manufacturer("Ford", Year.of(2004), "USA");

        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);
        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);
        List<Manufacturer> manufacturers1 = List.of(manufacturer1,manufacturer2);
        List<Manufacturer> manufacturers2 = List.of(manufacturer2,manufacturer1);
        Car car1 = new Car("Ford","Fiesta", "300000", 1900, manufacturers1, EngineType.V8);
        Car car2 = new Car("Ferrari","Tiesta Rossa", "1000000", 1999, manufacturers2, EngineType.V8);
        Car car3 = new Car("Ferrari","Tiesta Rossa", "1000000", 1999, manufacturers2, EngineType.V8);

        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));



    }
}

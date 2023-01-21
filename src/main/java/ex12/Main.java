package ex12;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Ford", Year.of(2004),"USA");
        Manufacturer manufacturer2 = new Manufacturer("Ford", Year.of(2004),"USA");

        System.out.println(manufacturer1.equals(manufacturer2));
    }
}

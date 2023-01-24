package ex24;
//Następnie stwórz klasę MeasurementConverter, która będzie posiadała metodę convert(int value, ConvertionType conversionType)
// i na podstawie przekazanej wartości oraz typu konwersji, korzystała z Convertera danego typu i zwracała wynik.


//EX 25. Zamień wyjątki BasketFullException oraz BasketEmptyException z poprzedniego zadania na wyjątki typu checked exception.
        //Obsłuż je.
public class Basket {
    private int itemsCount = 0;
    void addToBasket() throws BasketFullException {
        if(itemsCount <10) {
            itemsCount++;
        }else {
            throw new BasketFullException("Wyjmuj produkty z koszyka");
        }
    }
    void removeToBasket() throws BasketEmptyException {
        if(itemsCount >0){
            itemsCount--;
        }else {
            throw new BasketEmptyException();
        }

    }

    @Override
    public String toString() {
        return "Basket{" +
                "itemsCount=" + itemsCount +
                '}';
    }
}

package ex8;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(10,30,50,40.5f,true);
        Parcel parcel2 = new Parcel(10,300,50,12,true);
        Parcel parcel3 = new Parcel(10,15,50,30.5f,false);
        Parcel parcel4 = new Parcel(100,10,50,12,false);


        Validator validator = new Validator();
        validator.isDimensionViable(parcel1);
        validator.isDimensionViable(parcel2);

        validator.isWeightAlright(parcel1);
        validator.isWeightAlright(parcel2);
        validator.isWeightAlright(parcel3);
        validator.isWeightAlright(parcel4);
    }
}

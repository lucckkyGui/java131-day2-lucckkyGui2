package ex8;

public class Validator {
    public void  isDimensionViable(Parcel parcel) {
        if ((parcel.getxLenght() + parcel.getyLenght() + parcel.getzLenght()) <= 300) {
            System.out.println("Paczka: " + parcel.toString() +" jest git");
        } else {
            System.out.println("Paczka: "+ parcel.toString() +" jest za duża");
        }

    }
    public void isWeightAlright(Parcel parcel){
        if(parcel.getWeight() <=30 && !parcel.isExpress()){
            System.out.println("Paczka: "+ parcel + " jest dobra i nie jest ekspresowa");
        }else if (parcel.getWeight() <= 15 && parcel.isExpress()){
            System.out.println("Paczka: "+ parcel + " jest dobrej wagi i jest ekspresowa");
        } else {
            System.out.println("Paczka: "+ parcel + " jest złej wagi");
        }

    }


}
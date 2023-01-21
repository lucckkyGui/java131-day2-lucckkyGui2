package ex7;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int magazineSize;
    private List<String> magazine = new ArrayList<>();
    public Gun(int magazineSize){
        this.magazineSize = magazineSize;
    }
    public void loadBullet(String bulletName){

        if (magazineSize <= magazine.size()){
            System.out.println("Przekroczono limit");
            return;
        }
        magazine.add(bulletName);
        System.out.println(magazine);

    }
    public boolean isLoaded(){
        if(magazine.size() > 0){
            return true;
        }return false;

    }

    public void shot(){
        if(isLoaded()){
            System.out.println("Pif Paf " + magazine.remove(magazine.size()-1));

        }else{
            System.out.println("Pusty magazynek");
        }



    }

}

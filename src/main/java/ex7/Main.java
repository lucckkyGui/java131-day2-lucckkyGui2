package ex7;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun(5);
        checkGunIsLoaded(gun);
loadWithBullets(gun, 8);
//        gun.loadBullet("Bullet 1");
//        gun.loadBullet("Bullet 2");
//        gun.loadBullet("Bullet 3");
//        gun.loadBullet("Bullet 4");
//        gun.loadBullet("Bullet 5");
//        gun.loadBullet("Bullet 6");
//        gun.loadBullet("Bullet 7");
//        gun.loadBullet("Bullet 8");

        checkGunIsLoaded(gun);
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
    }

    private static void checkGunIsLoaded(Gun gun) {
        System.out.println("Broń naładowana: " + gun.isLoaded());
    }

    private static void loadWithBullets(Gun gun, int numberOfBullets){
        for(int i=1;i<=numberOfBullets; i++){
            gun.loadBullet("Bullet " +i);
        }
    }


}

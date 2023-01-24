package ex16;

public class Main {
    public static void main(String[] args) {
        System.out.println(Runner.getFitnessLevel(130));
        System.out.println(Runner.getFitnessLevel(140));
        System.out.println(Runner.getFitnessLevel(150));
        System.out.println(Runner.getFitnessLevel(190));
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println(Runner.getFitnessLevel2(190));
        System.out.println(Runner.getFitnessLevel2(150));
        System.out.println(Runner.getFitnessLevel2(120));
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println(Runner.getFitnessLevel3(190));
        System.out.println(Runner.getFitnessLevel3(150));
        System.out.println(Runner.getFitnessLevel3(-1));

    }
}

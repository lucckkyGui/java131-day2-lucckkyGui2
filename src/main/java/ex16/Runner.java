package ex16;

import java.util.Arrays;

public enum Runner {
    BEGINNER(160, Integer.MAX_VALUE),
    INTERMEDIATE(140, 159),
    ADVANCED(0, 139);

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    private int minTime;
    private int maxTime;

    public static Runner getFitnessLevel(int time) {
        if (BEGINNER.minTime <= time) {
            return BEGINNER;
        } else if (INTERMEDIATE.getMinTime()<= time && INTERMEDIATE.getMaxTime() >=time) {
            return INTERMEDIATE;
        } else {
            return ADVANCED;
        }

    }
    public static Runner getFitnessLevel2(int time) {
        for (Runner runner : Runner.values()) {
            if (runner.minTime <= time && runner.maxTime >= time){
                return  runner;
            }
        }
        return null;
    }
    public static Runner getFitnessLevel3(int time) {

       return Arrays.stream(Runner.values())
                .filter(runner -> runner.minTime <=time && runner.maxTime >=time)
                .findFirst()
                .orElseGet(()->{
                    System.out.println("Nie znalazłem poziomu biegacza dla czasu: " + time);
                    return null;
                });
    }

}


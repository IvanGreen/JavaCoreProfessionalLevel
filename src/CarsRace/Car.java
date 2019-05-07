package CarsRace;

import java.util.concurrent.BrokenBarrierException;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Participant #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " getting ready");
            Thread.sleep(1000 + (int)(Math.random() * 800));
            MainClass.cd1.countDown();
            System.out.println(this.name + " ready");

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            MainClass.cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
    }
}

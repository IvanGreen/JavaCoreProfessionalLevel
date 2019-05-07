package CarsRace;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class MainClass {
    public static final int CARS_COUNT = 4;
    static CyclicBarrier cb = new CyclicBarrier(CARS_COUNT);
    static CountDownLatch cd1 = new CountDownLatch(CARS_COUNT);
    static Semaphore smp = new Semaphore(CARS_COUNT / 2);
    static CountDownLatch cd2 = new CountDownLatch(CARS_COUNT * 2);

    public static void main(String[] args) {
        System.out.println("IMPORTANT ANNOUNCEMENT >>> Preparation!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        try {
            cd1.await(); //ждем
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("IMPORTANT ANNOUNCEMENT >>> The race has begun!!!");

        try {
            cd2.await(); //ждем
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("IMPORTANT ANNOUNCEMENT >>> The race is over!!!");

    }
}



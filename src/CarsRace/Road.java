package CarsRace;

public class Road extends Stage {
    public Road(int length) {
        this.length = length;
        this.description = "Road " + length + " meters";
    }
    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " started the stage: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.getName() + " finished stage: " + description);

            Thread.sleep(1000 + (int)(Math.random() * 800));
            MainClass.cd2.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}
}

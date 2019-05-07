package CarsRace;

public class Tunnel extends Stage {
    public Tunnel() {
        this.length = 80;
        this.description = "Tunnel " + length + " meters";
    }
    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " preparing for the stage (waiting): " + description);
                MainClass.smp.acquire();
                System.out.println(c.getName() + " started the stage: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " finished stage: " + description);
                MainClass.smp.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

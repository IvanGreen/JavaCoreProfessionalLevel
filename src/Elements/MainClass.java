package Elements;

public class MainClass {

    public static void main(String[] args) {

        Box<Apple> boxWithApple = new Box<>(new Apple(),new Apple(), new Apple());
        Box<Orange> boxWithOrange = new Box<>(new Orange(), new Orange(), new Orange(),new Orange());
        Box<Orange> anotherBoxWithOrange = new Box<>();
        System.out.println("Box weight with apples: " + boxWithApple.getWeight());
        System.out.println("Box weight with oranges: " + boxWithOrange.getWeight());
        System.out.println("Are the boxes equal? Answer: " + boxWithApple.compare(boxWithOrange));
        System.out.println("\n\nNow in a box with oranges: " + boxWithOrange.getBox() + ", and in another box " + anotherBoxWithOrange.getBox());
        System.out.println("Now let's pour the oranges into another box!");
        boxWithOrange.replaceFruits(anotherBoxWithOrange);
        System.out.println("Now in the first box with oranges: " + boxWithOrange.getBox() + ", and in the second: " + anotherBoxWithOrange.getBox());

        System.out.println("\n\nLet's add one orange to the first box!");
        boxWithOrange.addFruit(new Orange());
        System.out.println("Now in the box is: " + boxWithOrange.getBox());
    }
}

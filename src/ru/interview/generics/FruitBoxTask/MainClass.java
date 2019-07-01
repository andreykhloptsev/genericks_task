package ru.interview.generics.FruitBoxTask;

/**
 * Created by DIO
 */
public class MainClass {
    public static void main(String[] args) {

        Box<Orange> orangebox = new Box<>();
        Box<Apple> box = new Box<>();
        Fruit apple1 = new Apple();
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();
        Fruit apple4 = new Apple();
        Fruit orange1 = new Orange();

        box.put(apple1);
        box.put(apple2);
        box.put(apple1);
        box.put(orange1);
        box.put(apple4);
        orangebox.put(new Orange());
        orangebox.put(new Orange());
        System.out.println(box.getWeight());
        System.out.println( box.compare(orangebox));
        box.shift(orangebox);
    }
}

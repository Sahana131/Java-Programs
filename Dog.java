public class Dog extends Animal {

    @Override
    public void play() {
        System.out.println("Dog plays with a ball");
    }

    @Override
    public void sound() {
        System.out.println("Dog says: Woof Woof");
    }
}
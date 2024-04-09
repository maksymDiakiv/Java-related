public class Fish implements Predator, Prey{
    @Override
    public void hunt() {
        System.out.println("hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("hiding from bigger fish");
    }
}

public class Knight implements Character{
    @Override
    public void attack() {
        System.out.println("You cut with a sword.");
    }

    @Override
    public void greeting() {
        System.out.println("Hello, I'm knight. I'm here to protect and serve with honor.");
    }

    @Override
    public void equipment() {
        System.out.println("Equipment: armor, sword, shield, dagger.");
    }
}

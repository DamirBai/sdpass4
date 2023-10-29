public class Archer implements Character{
    @Override
    public void attack() {
        System.out.println("You shot a bow.");
    }

    @Override
    public void greeting() {
        System.out.println("Hi, I'm archer. I'm the one who never misses the target.");
    }

    @Override
    public void equipment() {
        System.out.println("Equipment: mantle, bow, arrows, dagger, bowstring, quiver.");
    }
}

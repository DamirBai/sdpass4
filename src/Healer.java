public class Healer implements Character{
    @Override
    public void attack() {
        System.out.println("You attacked with your wand.");
    }

    @Override
    public void greeting() {
        System.out.println("Hello, I'm a healer. I can heal and mend.");
    }

    @Override
    public void equipment() {
        System.out.println("Equipment: robe, medicines, wand, bandages, bag, amulet, elixirs and potions.");
    }
}

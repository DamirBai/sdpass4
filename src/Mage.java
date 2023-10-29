public class Mage implements Character {
    @Override
    public void attack() {
        System.out.println("You attacked with a strong magic spell!");
    }

    @Override
    public void greeting() {
        System.out.println("Hello, I'm mage. I command the arcane forces and mysteries of magic.");
    }

    @Override
    public void equipment() {
        System.out.println("Equipment: robe, spellbook, wand, amulet, potions");
    }
}

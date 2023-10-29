public class Main {
    public static void main(String[] args) {
        CharacterFactory healerFactory = new HealerFactory();
        CharacterFactory knightFactory = new KnightFactory();
        CharacterFactory mageFactory = new MageFactory();
        //i want healer
        Character healer = healerFactory.createCharacter();
        healer.greeting();
        healer.attack();
        healer.equipment();
    }
}
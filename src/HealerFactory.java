public class HealerFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Healer();
    }
}

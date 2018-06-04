package ndaniluk.decorator.concrete.race;

public class Human implements Race {
    @Override
    public String getName() {
        return "Human";
    }

    @Override
    public String getAbilities() {
        return "None";
    }
}
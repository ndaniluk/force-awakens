package ndaniluk.decorator.concrete.race;

public class Rogue implements Race {
    @Override
    public String getName() {
        return "Rogue";
    }

    @Override
    public String getAbilities() {
        return "Flying, sensitive to damage";
    }
}
package ndaniluk.force.awakens.decorator.concrete.race;

public class Rogue implements IRace {

    @Override
    public String getName() {
        return "Rogue";
    }

    @Override
    public String getAbilities() {
        return "Flying, sensitive to damage";
    }
}

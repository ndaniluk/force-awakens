package ndaniluk.force.awakens.decorator.concrete.race;

public class Elf implements IRace {

    @Override
    public String getName() {
        return "Elf";
    }

    @Override
    public String getAbilities() {
        return "Seeing in the dark, super agility";
    }
}

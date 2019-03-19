package ndaniluk.force.awakens.decorator.concrete.profession;

public class Killer implements IProfession {

    @Override
    public String getName() {
        return "Killer";
    }

    @Override
    public String getAbilities() {
        return "Sneaking, acids, melee combat";
    }
}

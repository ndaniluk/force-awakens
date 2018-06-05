package ndaniluk.force.awakens.decorator.concrete.profession;

public class Warrior implements IProfession {
    @Override
    public String getName() {
        return "Warrior";
    }

    @Override
    public String getAbilities() {
        return "Melee combat, uses sword/axe/spear";
    }
}

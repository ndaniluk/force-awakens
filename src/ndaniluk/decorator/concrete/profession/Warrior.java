package ndaniluk.decorator.concrete.profession;

public class Warrior implements Profession {
    @Override
    public String getName() {
        return "Warrior";
    }

    @Override
    public String getAbilities() {
        return "Melee combat, uses sword/axe/spear";
    }
}

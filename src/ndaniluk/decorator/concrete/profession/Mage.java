package ndaniluk.decorator.concrete.profession;

public class Mage implements IProfession {
    @Override
    public String getName() {
        return "Mage";
    }

    @Override
    public String getAbilities() {
        return "Sorcery, potions";
    }
}

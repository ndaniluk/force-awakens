package ndaniluk.decorator.concrete.profession;

public class Killer implements Profession {
    @Override
    public String getName() {
        return "Killer";
    }

    @Override
    public String getAbilities() {
        return "Sneaking, acids, melee combat";
    }
}

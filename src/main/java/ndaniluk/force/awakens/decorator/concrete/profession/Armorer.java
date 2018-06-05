package ndaniluk.force.awakens.decorator.concrete.profession;

public class Armorer implements IProfession {
    @Override
    public String getName() {
        return "Armorer";
    }

    @Override
    public String getAbilities() {
        return "Equipment repair";
    }
}

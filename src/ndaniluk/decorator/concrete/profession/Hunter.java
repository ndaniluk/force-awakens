package ndaniluk.decorator.concrete.profession;

public class Hunter implements IProfession {
    @Override
    public String getName() {
        return "Hunter";
    }

    @Override
    public String getAbilities() {
        return "Sneaking, archery";
    }
}

package ndaniluk.decorator.concrete.profession;

public class Hunter implements Profession {
    @Override
    public String getName() {
        return "Hunter";
    }

    @Override
    public String getAbilities() {
        return "Sneaking, archery";
    }
}

package ndaniluk.decorator.concrete.profession;

public class Armorer implements Profession {
    @Override
    public String getName() {
        return "Armorer";
    }

    @Override
    public String getAbilities() {
        return "Equipment repair";
    }
}

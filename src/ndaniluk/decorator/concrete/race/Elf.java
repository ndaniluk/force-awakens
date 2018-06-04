package ndaniluk.decorator.concrete.race;

public class Elf implements Race {
    @Override
    public String getName() {
        return "Elf";
    }

    @Override
    public String getAbilities() {
        return "Seeing in the dark, super agility";
    }
}
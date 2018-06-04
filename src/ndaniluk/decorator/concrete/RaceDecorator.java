package ndaniluk.decorator.concrete;

import ndaniluk.component.CharacterComponent;
import ndaniluk.decorator.CharacterDecorator;
import ndaniluk.decorator.concrete.race.*;

public class RaceDecorator extends CharacterDecorator {

    private RaceList chosenRaceName;
    private Race chosenRace;

    public RaceDecorator(RaceList chosenRaceName, CharacterComponent decoratedCharacter) {
        super(decoratedCharacter);
        this.chosenRaceName = chosenRaceName;
        this.chosenRace = chooseProfession(chosenRaceName);
    }

    @Override
    public String getDescription() {
        return decoratedCharacter.getDescription() + "\n" + chosenRace.getName() + "'s abilities: " + chosenRace.getAbilities();
    }

    private Race chooseProfession(RaceList profession){
        switch (profession){
            case HUMAN:
                return new Human();

            case ELF:
                return new Elf();

            case DWARF:
                return new Dwarf();

            case ROGUE:
                return new Rogue();
        }
        return null;
    }
}

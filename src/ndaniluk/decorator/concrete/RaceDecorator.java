package ndaniluk.decorator.concrete;

import ndaniluk.component.CharacterComponent;
import ndaniluk.decorator.CharacterDecorator;
import ndaniluk.decorator.concrete.race.*;

public class RaceDecorator extends CharacterDecorator {

    private IRace race;

    public RaceDecorator(ERace raceName, CharacterComponent decoratedCharacter) {
        super(decoratedCharacter);
        this.race = chooseRace(raceName);
    }

    @Override
    public String getDescription() {
        return decoratedCharacter.getDescription() + "\n" + race.getName() + "'s abilities: " + race.getAbilities();
    }

    private IRace chooseRace(ERace raceName){
        switch (raceName){
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

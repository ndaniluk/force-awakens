package ndaniluk.force.awakens.decorator.concrete;

import ndaniluk.force.awakens.component.CharacterComponent;
import ndaniluk.force.awakens.decorator.CharacterDecorator;
import ndaniluk.force.awakens.decorator.concrete.race.Dwarf;
import ndaniluk.force.awakens.decorator.concrete.race.ERace;
import ndaniluk.force.awakens.decorator.concrete.race.Elf;
import ndaniluk.force.awakens.decorator.concrete.race.Human;
import ndaniluk.force.awakens.decorator.concrete.race.IRace;
import ndaniluk.force.awakens.decorator.concrete.race.Rogue;

public class RaceDecorator extends CharacterDecorator {

  private IRace race;

  public RaceDecorator(ERace raceName, CharacterComponent decoratedCharacter) {
    super(decoratedCharacter);
    this.race = chooseRace(raceName);
  }

  @Override
  public String getName() {
    return decoratedCharacter.getName();
  }

  @Override
  public String getDescription() {
    return decoratedCharacter.getDescription()
        + "\n"
        + race.getName()
        + "'s abilities: "
        + race.getAbilities();
  }

  public IRace getRace() {
    return race;
  }

  private IRace chooseRace(ERace raceName) {
    switch (raceName) {
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

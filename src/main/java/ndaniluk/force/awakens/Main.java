package ndaniluk.force.awakens;

import java.io.IOException;
import ndaniluk.force.awakens.component.CharacterComponent;
import ndaniluk.force.awakens.component.concrete.SimpleCharacter;
import ndaniluk.force.awakens.decorator.concrete.ProfessionDecorator;
import ndaniluk.force.awakens.decorator.concrete.RaceDecorator;
import ndaniluk.force.awakens.decorator.concrete.profession.EProfession;
import ndaniluk.force.awakens.decorator.concrete.race.ERace;
import ndaniluk.force.awakens.utils.txt.ToTxt;

public class Main {
  public static void main(String[] args) throws IOException {
    // EXAMPLE USE

    // Two professions
    CharacterComponent myCharacter1 =
        new RaceDecorator(
            ERace.ELF,
            new ProfessionDecorator(
                EProfession.MAGE, EProfession.WARRIOR, new SimpleCharacter("Josh")));

    // One profession
    CharacterComponent myCharacter2 =
        new RaceDecorator(
            ERace.DWARF, new ProfessionDecorator(EProfession.KILLER, new SimpleCharacter("Josh2")));

    ToTxt.write(myCharacter1);
    ToTxt.write(myCharacter2);
  }
}

package ndaniluk;

import ndaniluk.component.CharacterComponent;
import ndaniluk.component.concrete.SimpleCharacter;
import ndaniluk.decorator.concrete.ProfessionDecorator;
import ndaniluk.decorator.concrete.RaceDecorator;
import ndaniluk.decorator.concrete.profession.EProfession;
import ndaniluk.decorator.concrete.race.ERace;

public class Main {
    public static void main(String[] args) {
        //EXAMPLE USE

        //Two professions
        CharacterComponent myCharacter1 = new RaceDecorator(ERace.ELF, new ProfessionDecorator(EProfession.MAGE, EProfession.WARRIOR, new SimpleCharacter()));
        System.out.println(myCharacter1.getDescription());

        //One profession
        CharacterComponent myCharacter2 = new RaceDecorator(ERace.DWARF, new ProfessionDecorator(EProfession.KILLER, new SimpleCharacter()));
        System.out.println(myCharacter2.getDescription());
    }
}

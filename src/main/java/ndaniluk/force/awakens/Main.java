package ndaniluk.force.awakens;

import ndaniluk.force.awakens.component.CharacterComponent;
import ndaniluk.force.awakens.component.concrete.SimpleCharacter;
import ndaniluk.force.awakens.decorator.concrete.ProfessionDecorator;
import ndaniluk.force.awakens.decorator.concrete.RaceDecorator;
import ndaniluk.force.awakens.decorator.concrete.profession.EProfession;
import ndaniluk.force.awakens.decorator.concrete.race.ERace;

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

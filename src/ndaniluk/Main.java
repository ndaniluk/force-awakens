package ndaniluk;

import ndaniluk.component.CharacterComponent;
import ndaniluk.component.concrete.SimpleCharacter;
import ndaniluk.decorator.concrete.ProfessionDecorator;
import ndaniluk.decorator.concrete.RaceDecorator;
import ndaniluk.decorator.concrete.profession.ProfessionEnum;
import ndaniluk.decorator.concrete.race.RaceList;

public class Main {
    public static void main(String[] args) {
        //EXAMPLE USE
        CharacterComponent myCharacter = new RaceDecorator(RaceList.ELF, new ProfessionDecorator(ProfessionEnum.MAGE, ProfessionEnum.WARRIOR, new SimpleCharacter()));
        System.out.println(myCharacter.getDescription());
    }
}

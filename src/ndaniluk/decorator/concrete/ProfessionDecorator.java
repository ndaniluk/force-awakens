package ndaniluk.decorator.concrete;

import ndaniluk.component.CharacterComponent;
import ndaniluk.decorator.CharacterDecorator;
import ndaniluk.decorator.concrete.profession.*;

public class ProfessionDecorator extends CharacterDecorator {

    private ProfessionList chosenProfessionName;
    private Profession profession;

    public ProfessionDecorator(ProfessionList chosenProfession, CharacterComponent decoratedCharacter) {
        super(decoratedCharacter);
        this.chosenProfessionName = chosenProfession;
        this.profession = chooseProfession(chosenProfessionName);
    }

    @Override
    public String getDescription() {
        return decoratedCharacter.getDescription() + "\n" + profession.getName() + "'s abilities: " + profession.getAbilities();
    }

    private Profession chooseProfession(ProfessionList profession){
        switch (profession){
            case ARMORER:
                return new Armorer();

            case HUNTER:
                return new Hunter();

            case KILLER:
                return new Killer();

            case MAGE:
                return new Mage();

            case WARRIOR:
                return new Warrior();
        }
        return null;
    }
}

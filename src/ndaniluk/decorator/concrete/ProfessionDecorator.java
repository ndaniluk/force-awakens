package ndaniluk.decorator.concrete;

import ndaniluk.component.CharacterComponent;
import ndaniluk.decorator.CharacterDecorator;
import ndaniluk.decorator.concrete.profession.*;

import java.util.ArrayList;
import java.util.List;

public class ProfessionDecorator extends CharacterDecorator {

    private List<ProfessionEnum> professionNamesList;
    private List<Profession> professionList;

    public ProfessionDecorator(ProfessionEnum chosenProfessionName, CharacterComponent decoratedCharacter) {
        super(decoratedCharacter);
        professionNamesList = new ArrayList<>();
        professionList = new ArrayList<>();

        professionNamesList.add(chosenProfessionName);
        create();
    }

    public ProfessionDecorator(ProfessionEnum chosenProfessionName1, ProfessionEnum chosenProfessionName2, CharacterComponent decoratedCharacter) {
        super(decoratedCharacter);
        professionNamesList = new ArrayList<>();
        professionList = new ArrayList<>();

        professionNamesList.add(chosenProfessionName1);
        professionNamesList.add(chosenProfessionName2);
        create();
    }

    @Override
    public String getDescription() {
        if(professionList.size() == 1)
            return decoratedCharacter.getDescription() + "\n" + professionList.get(0).getName() + "'s abilities: " + professionList.get(0).getAbilities();
        else
            return decoratedCharacter.getDescription() + "\n" + professionList.get(0).getName() + "'s abilities: " + professionList.get(0).getAbilities()
                    + "\n" + professionList.get(1).getName() + "'s abilities: " + professionList.get(1).getAbilities();
    }

    private void create(){
        for(ProfessionEnum profession : professionNamesList)
            professionList.add(chooseProfession(profession));
    }

    private Profession chooseProfession(ProfessionEnum profession){
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

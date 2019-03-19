package ndaniluk.force.awakens.decorator.concrete;

import ndaniluk.force.awakens.component.CharacterComponent;
import ndaniluk.force.awakens.decorator.CharacterDecorator;
import ndaniluk.force.awakens.decorator.concrete.profession.*;

import java.util.ArrayList;
import java.util.List;

public class ProfessionDecorator extends CharacterDecorator {

    private List<EProfession> professionNamesList;
    private List<IProfession> ProfessionList;

    public ProfessionDecorator(
            EProfession chosenProfessionName, CharacterComponent decoratedCharacter) {
        super(decoratedCharacter);
        professionNamesList = new ArrayList<>();
        ProfessionList = new ArrayList<>();

        professionNamesList.add(chosenProfessionName);
        create();
    }

    public ProfessionDecorator(
            EProfession chosenProfessionName1,
            EProfession chosenProfessionName2,
            CharacterComponent decoratedCharacter) {
        super(decoratedCharacter);
        professionNamesList = new ArrayList<>();
        ProfessionList = new ArrayList<>();

        professionNamesList.add(chosenProfessionName1);
        professionNamesList.add(chosenProfessionName2);
        create();
    }

    @Override
    public String getName() {
        return decoratedCharacter.getName();
    }

    @Override
    public String getDescription() {
        if (ProfessionList.size() == 1) {
            return decoratedCharacter.getDescription()
                    + "\n"
                    + ProfessionList.get(0).getName()
                    + "'s abilities: "
                    + ProfessionList.get(0).getAbilities();
        } else {
            return decoratedCharacter.getDescription()
                    + "\n"
                    + ProfessionList.get(0).getName()
                    + "'s abilities: "
                    + ProfessionList.get(0).getAbilities()
                    + "\n"
                    + ProfessionList.get(1).getName()
                    + "'s abilities: "
                    + ProfessionList.get(1).getAbilities();
        }
    }

    public List<IProfession> getProfessionList() {
        return ProfessionList;
    }

    private void create() {
        for (EProfession profession : professionNamesList) {
            ProfessionList.add(chooseProfession(profession));
        }
    }

    private IProfession chooseProfession(EProfession profession) {
        switch (profession) {
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

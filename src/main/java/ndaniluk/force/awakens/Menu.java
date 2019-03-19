package ndaniluk.force.awakens;

import ndaniluk.force.awakens.component.CharacterComponent;
import ndaniluk.force.awakens.component.concrete.SimpleCharacter;
import ndaniluk.force.awakens.decorator.concrete.ProfessionDecorator;
import ndaniluk.force.awakens.decorator.concrete.RaceDecorator;
import ndaniluk.force.awakens.decorator.concrete.profession.EProfession;
import ndaniluk.force.awakens.decorator.concrete.race.ERace;
import ndaniluk.force.awakens.utils.txt.ToTxt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void run() {
        System.out.println("Force Awakens!");
        System.out.println("Let's create your RPG character!\n");

        AttributesSelector attributesSelector = new AttributesSelector();
        ERace selectedRace = selectRace(attributesSelector);
        int professionCounter = chooseProfessionsCount();

        EProfession[] selectedProfessions = chooseProfessions(professionCounter, attributesSelector);
        String name = chooseName();
        CharacterComponent myCharacter = createCharacter(professionCounter, selectedRace, selectedProfessions, name);
        ToTxt.write(myCharacter);
    }

    private ERace selectRace(AttributesSelector attributesSelector) {
        System.out.println("Which race do you choose?");
        ERace selectedRace;
        do {
            selectedRace = attributesSelector.selectRace();
            if (selectedRace == null) {
                System.out.println("Please try again...");
            }
        } while (selectedRace == null);
        return selectedRace;
    }

    private int chooseProfessionsCount() {
        System.out.println("How many professions do you want to choose? (1/2)");
        int professionCounter = 0;
        Scanner scannerInt = new Scanner(System.in);
        while (professionCounter < 1 || professionCounter > 2) {
            try {
                professionCounter = scannerInt.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please try again...");
                scannerInt.nextLine();
                continue;
            }
            if (professionCounter < 1 || professionCounter > 2) {
                System.out.println("Please try again...");
            }
        }
        return professionCounter;
    }

    private EProfession[] chooseProfessions(int professionCounter, AttributesSelector attributesSelector) {
        EProfession[] selectedProfessions = new EProfession[professionCounter];
        System.out.println("Which profession do you choose?");
        for (int i = 0; i < professionCounter; i++) {
            do {
                selectedProfessions[i] = attributesSelector.selectProfession();
                if (selectedProfessions[i] == null) {
                    System.out.println("Please try again");
                }
            } while (selectedProfessions[i] == null);
            if (professionCounter == 2) {
                if (i == 1) {
                    if (selectedProfessions[1] == selectedProfessions[0]) {
                        System.out.println("Please select different professions...");
                        i--;
                    }
                }
            }
        }
        return selectedProfessions;
    }

    private String chooseName() {
        System.out.println("Select your name");
        Scanner scannerLine = new Scanner(System.in);
        String name = scannerLine.nextLine();
        return name;
    }

    private CharacterComponent createCharacter(int professionCounter, ERace selectedRace, EProfession[] selectedProfessions, String name) {
        CharacterComponent myCharacter;
        if (professionCounter == 1) {
            myCharacter = new RaceDecorator(selectedRace,
                    new ProfessionDecorator(selectedProfessions[0], new SimpleCharacter(name)));
        } else {
            myCharacter = new RaceDecorator(selectedRace,
                    new ProfessionDecorator(selectedProfessions[0], selectedProfessions[1],
                            new SimpleCharacter(name)));
        }
        return myCharacter;
    }
}

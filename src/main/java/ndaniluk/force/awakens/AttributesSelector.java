package ndaniluk.force.awakens;


import ndaniluk.force.awakens.decorator.concrete.profession.EProfession;
import ndaniluk.force.awakens.decorator.concrete.race.ERace;

import java.util.*;

public class AttributesSelector {
    public ERace selectRace(){
        List<ERace> raceList = new ArrayList<>(EnumSet.allOf(ERace.class));

        System.out.println("Select race:");
        int i = 1;
        for(ERace race : raceList) {
            System.out.println("[" + i++ + "] " + race);
        }
        Scanner scannerInt = new Scanner(System.in);
        int selectedRace = inputSelection();

        switch (selectedRace){
            case 1:
                return ERace.HUMAN;

            case 2:
                return ERace.ELF;

            case 3:
                return ERace.DWARF;

            case 4:
                return ERace.ROGUE;

            default:
                return null;
        }

    }

    public EProfession selectProfession(){
        List<EProfession> professionList = new ArrayList<>(EnumSet.allOf(EProfession.class));

        System.out.println("Select profession:");
        int i = 1;
        for(EProfession profession : professionList) {
            System.out.println("[" + i++ + "] " + profession);
        }

        Scanner scannerInt = new Scanner(System.in);

        int selectedProfession = inputSelection();

        switch (selectedProfession){
            case 1:
                return EProfession.ARMORER;

            case 2:
                return EProfession.HUNTER;

            case 3:
                return EProfession.KILLER;

            case 4:
                return EProfession.MAGE;

            case 5:
                return EProfession.WARRIOR;

            default:
                return null;
        }

    }

    private int inputSelection(){
        Scanner scannerInt = new Scanner(System.in);
        int selection = 0;
        while(true) {
            try {
                selection = scannerInt.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Please try again...");
                scannerInt.nextLine();
                continue;
            }
            break;
        }
        return selection;
    }
}

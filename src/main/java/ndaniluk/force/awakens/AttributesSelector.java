package ndaniluk.force.awakens;


import ndaniluk.force.awakens.decorator.concrete.profession.EProfession;
import ndaniluk.force.awakens.decorator.concrete.race.ERace;
import ndaniluk.force.awakens.decorator.concrete.race.Rogue;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

public class AttributesSelector {
    public ERace selectRace(){
        List<ERace> raceList = new ArrayList<>(EnumSet.allOf(ERace.class));

        System.out.println("Select race:");
        int i = 1;
        for(ERace race : raceList) {
            System.out.println("[" + i + "] " + raceList.get(i-1));
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
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
            System.out.println("[" + i + "] " + professionList.get(i - 1));
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
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
}

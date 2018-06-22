package ndaniluk.force.awakens;

import ndaniluk.force.awakens.component.CharacterComponent;
import ndaniluk.force.awakens.component.concrete.SimpleCharacter;
import ndaniluk.force.awakens.decorator.concrete.ProfessionDecorator;
import ndaniluk.force.awakens.decorator.concrete.RaceDecorator;
import ndaniluk.force.awakens.decorator.concrete.profession.EProfession;
import ndaniluk.force.awakens.decorator.concrete.race.ERace;
import ndaniluk.force.awakens.utils.txt.ToTxt;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    System.out.println("Force Awakens!");
    System.out.println("Let's create your RPG character!\n");

    AttributesSelector attributesSelector = new AttributesSelector();
    System.out.println("Which race do you choose?");
    ERace selectedRace;
    do {
      selectedRace = attributesSelector.selectRace();
      if (selectedRace == null)
        System.out.println("Please try again...");
    }while(selectedRace == null);


    System.out.println("How many professions do you want to choose? (1/2)");
    int professionCounter = 0;
    Scanner scannerInt = new Scanner(System.in);
    while(professionCounter < 1 || professionCounter > 2) {
      professionCounter = scannerInt.nextInt();
      if (professionCounter < 1 || professionCounter > 2)
        System.out.println("Please try again...");
    }

    EProfession[] selectedProfessions = new EProfession[professionCounter];
    System.out.println("Which profession do you choose?");
    for (int i = 0; i < professionCounter; i++){
      do {
        selectedProfessions[i] = attributesSelector.selectProfession();
        if (selectedProfessions[i] == null)
          System.out.println("Please try again");
      }while(selectedProfessions[i] == null);
        if(professionCounter == 2)
        if(i == 1)
          if(selectedProfessions[1] == selectedProfessions[0]) {
            System.out.println("Please select different professions...");
            i--;
          }
    }

    System.out.println("Select your name");
    Scanner scannerLine = new Scanner(System.in);
    String name = scannerLine.nextLine();

    CharacterComponent myCharacter;
    if(professionCounter == 1)
      myCharacter = new RaceDecorator(selectedRace, new ProfessionDecorator(selectedProfessions[0], new SimpleCharacter(name)));
    else
      myCharacter = new RaceDecorator(selectedRace, new ProfessionDecorator(selectedProfessions[0], selectedProfessions[1], new SimpleCharacter(name)));

    ToTxt.write(myCharacter);
  }
}

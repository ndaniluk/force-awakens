package ndaniluk.force.awakens.utils.txt;

import ndaniluk.force.awakens.component.CharacterComponent;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ToTxt {

    public static void write(CharacterComponent character) {
        try {
            File file = new File("characterList.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(
                    "Name: " + character.getName() + "\nDescription: " + character.getDescription() + "\n\n");
            bw.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

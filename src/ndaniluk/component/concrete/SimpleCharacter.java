package ndaniluk.component.concrete;

import ndaniluk.component.CharacterComponent;

public class SimpleCharacter implements CharacterComponent {
    @Override
    public String getDescription() {
        return "Character:";
    }
}

package ndaniluk.force.awakens.component.concrete;

import ndaniluk.force.awakens.component.CharacterComponent;

public class SimpleCharacter implements CharacterComponent {
    @Override
    public String getDescription() {
        return "Character:";
    }
}

package ndaniluk.decorator;

import ndaniluk.component.CharacterComponent;

public abstract class CharacterDecorator implements CharacterComponent {
    protected CharacterComponent decoratedCharacter;

    public CharacterDecorator(CharacterComponent decoratedCharacter) {
        this.decoratedCharacter = decoratedCharacter;
    }
}

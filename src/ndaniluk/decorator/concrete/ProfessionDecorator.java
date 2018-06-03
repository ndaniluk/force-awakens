package ndaniluk.decorator.concrete;

import ndaniluk.component.CharacterComponent;
import ndaniluk.decorator.CharacterDecorator;

public class ProfessionDecorator extends CharacterDecorator {
    public ProfessionDecorator(CharacterComponent decoratedCharacter) {
        super(decoratedCharacter);
    }

    @Override
    public String showCharacter() {
        return null;
    }

    
}

package ndaniluk.force.awakens.decorator;

import ndaniluk.force.awakens.component.CharacterComponent;

public abstract class CharacterDecorator implements CharacterComponent {

  protected CharacterComponent decoratedCharacter;

  public CharacterDecorator(CharacterComponent decoratedCharacter) {
    this.decoratedCharacter = decoratedCharacter;
  }
}

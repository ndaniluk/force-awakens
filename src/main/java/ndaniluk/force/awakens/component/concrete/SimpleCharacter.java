package ndaniluk.force.awakens.component.concrete;

import ndaniluk.force.awakens.component.CharacterComponent;

public class SimpleCharacter implements CharacterComponent {

  private String name;

  public SimpleCharacter(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return "";
  }
}

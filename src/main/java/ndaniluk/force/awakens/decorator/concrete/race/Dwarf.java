package ndaniluk.force.awakens.decorator.concrete.race;

public class Dwarf implements IRace {
  @Override
  public String getName() {
    return "Dwarf";
  }

  @Override
  public String getAbilities() {
    return "Seeing in the dark, super stamina";
  }
}

package attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;


public class Blizzard extends SpecialMove {
    public Blizzard()
    {
        super(Type.ICE,110,70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().chance(0.1).condition(Status.FREEZE);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Blizzard";
    }
}
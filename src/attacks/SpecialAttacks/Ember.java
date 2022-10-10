package attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class Ember extends SpecialMove {
    public Ember()
    {
        super(Type.FIRE,40,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().chance(0.1).condition(Status.BURN);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Ember";
    }
}

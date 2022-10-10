package attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest()
    {
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().condition(Status.SLEEP).stat(Stat.HP,(int) pokemon.getHP()).turns(2);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Rest";
    }
}

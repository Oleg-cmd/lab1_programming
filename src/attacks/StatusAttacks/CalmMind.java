package attacks.StatusAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class CalmMind extends StatusMove {
    public CalmMind()
    {
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.SPECIAL_ATTACK, +1);
        pokemon.setMod(Stat.SPECIAL_DEFENSE, +1);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет CalmMind";
    }
}

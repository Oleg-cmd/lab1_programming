package attacks.StatusAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam()
    {
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.EVASION, +1);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет DoubleTeam";
    }
}

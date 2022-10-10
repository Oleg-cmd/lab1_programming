package attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FeintAttack extends PhysicalMove {
    public FeintAttack()
    {
        // pokemon docs - infinity accuracy, but max  accuracy can be only 100 (percent)
        super(Type.DARK,60,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        // imposible to do with this methods
        // pokemon docs - Feint Attack deals damage and ignores changes to the Accuracy and Evasion stats. However, it will not hit Pokémon during the invulnerable stage of Bounce, Dig, Dive, Fly, Shadow Force or Sky Drop.

    }

    @Override
    protected String describe() {
        return "применяет FeintAttack";
    }
}

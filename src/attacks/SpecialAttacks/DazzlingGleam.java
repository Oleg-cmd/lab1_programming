package attacks.SpecialAttacks;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam()
    {
        super(Type.FAIRY,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        // impossible to do, i cant get list of all pokemons in the battle and cant deal damage to all of them

    }

    @Override
    protected String describe() {
        return "применяет DazzlingGleam";
    }
}

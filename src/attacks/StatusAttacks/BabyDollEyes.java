package attacks.StatusAttacks;

import ru.ifmo.se.pokemon.*;

public class BabyDollEyes extends StatusMove {
    public BabyDollEyes()
    {
        super(Type.FAIRY,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.ATTACK, -1);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет BabyDollEyes";
    }
}

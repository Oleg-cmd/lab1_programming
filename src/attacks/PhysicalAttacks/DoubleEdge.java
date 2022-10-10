package attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.*;

public class DoubleEdge extends PhysicalMove {
    public DoubleEdge()
    {
        super(Type.NORMAL,120,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMod(Stat.HP, (int) -(DoubleEdge.this.power/3));
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет DoubleEdge";
    }
}
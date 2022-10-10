package pokemons;

import attacks.PhysicalAttacks.DoubleEdge;
import attacks.SpecialAttacks.Blizzard;
import attacks.SpecialAttacks.DazzlingGleam;
import attacks.StatusAttacks.BabyDollEyes;
import ru.ifmo.se.pokemon.*;


public class Audino extends Pokemon {
    public Audino(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(103,60,86,60,86,50);
        this.setType(Type.NORMAL);
        this.addMove(new DoubleEdge());
        this.addMove(new Blizzard());
        this.addMove(new BabyDollEyes());
        this.addMove(new DazzlingGleam());

    }
}

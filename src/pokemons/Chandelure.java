package pokemons;

import attacks.SpecialAttacks.Ember;
import attacks.StatusAttacks.CalmMind;
import attacks.StatusAttacks.DoubleTeam;
import attacks.StatusAttacks.Rest;
import ru.ifmo.se.pokemon.*;


public class Chandelure extends Lampent{
    public Chandelure(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(60,40,60,95,60,55);
        this.setType(Type.GHOST, Type.FIRE);
        this.setMove(new DoubleTeam());
        this.setMove(new CalmMind());
        this.setMove(new Ember());
        this.setMove(new Rest());
    }
}

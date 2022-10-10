package pokemons;


import attacks.StatusAttacks.CalmMind;
import attacks.StatusAttacks.DoubleTeam;
import ru.ifmo.se.pokemon.*;

public class Litwick extends Pokemon{
    public Litwick(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(50,30,55,65,55,20);
        this.setType(Type.GHOST, Type.FIRE);
        this.setMove(new DoubleTeam());
        this.setMove(new CalmMind());

    }
}

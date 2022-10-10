package pokemons;



import attacks.PhysicalAttacks.FeintAttack;
import attacks.PhysicalAttacks.RockSlide;

import attacks.StatusAttacks.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bonsly extends Pokemon {
    public Bonsly(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(50,80,95,10,45,10);
        this.setType(Type.ROCK);

        this.addMove(new FeintAttack());
        this.addMove(new RockSlide());
        this.addMove(new DoubleTeam());



    }
}

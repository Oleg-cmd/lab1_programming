package pokemons;



import attacks.PhysicalAttacks.FeintAttack;
import attacks.PhysicalAttacks.RockSlide;
import attacks.PhysicalAttacks.Slam;
import attacks.StatusAttacks.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Sudowoodo extends Bonsly{
    public Sudowoodo(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(70,100,115,30,65,30);
        this.setType(Type.ROCK);
        this.setMove(new FeintAttack());
        this.setMove(new RockSlide());
        this.setMove(new DoubleTeam());
        this.setMove(new Slam());

    }
}

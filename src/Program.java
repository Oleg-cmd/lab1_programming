import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Program {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Audino("Hearing Pokémon", 100);
        Pokemon p2 = new Bonsly("Bonsai Pokémon", 100);
        Pokemon p3 = new Sudowoodo("Imitation Pokémon", 100);

        Pokemon p4 = new Litwick("Candle Pokémon", 100);
        Pokemon p5 = new Lampent("Lamp Pokémon", 100);
        Pokemon p6 = new Chandelure("Luring Pokémon", 100);

        b.addAlly(p1);
        b.addAlly(p5);
        b.addAlly(p6);

        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);

        b.go(); // lets fight
    }
}

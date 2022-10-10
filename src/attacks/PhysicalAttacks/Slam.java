package attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slam extends PhysicalMove {
    public Slam()
    {
        // pokemon docs - infinity accuracy, but max  accuracy can be only 100 (percent)
        super(Type.NORMAL,80,75);
    }


    @Override
    protected String describe() {
        return "применяет Slam";
    }
}

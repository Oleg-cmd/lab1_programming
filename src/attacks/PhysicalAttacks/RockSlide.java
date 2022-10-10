package attacks.PhysicalAttacks;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide()
    {
        super(Type.ROCK,75,90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        // in docs there is an effect like SLEEP called flinch, but there isnt this status on the real world
        Effect effect = new Effect().chance(0.3).condition(Status.SLEEP);
        System.out.println("fllinch");
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет RockSlide";
    }
}

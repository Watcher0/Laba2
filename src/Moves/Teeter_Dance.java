package Moves;

import ru.ifmo.se.pokemon.*;

public class Teeter_Dance extends StatusMove {
    public Teeter_Dance(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        boolean chance = new Randomiser().getChance(0.5);
        if (chance) {
            Effect.confuse(pokemon);
        }
    }
    @Override
    protected String describe(){
        return "использовал Teeter Dance";
    }
}

package Moves;

import ru.ifmo.se.pokemon.*;

public class Ice_Punch extends PhysicalMove {
    public Ice_Punch() {
        super(Type.ICE, 75, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        boolean chance = new Randomiser().getChance(0.1);
        if (chance) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected String describe(){
        return "использовал Ice Punch";
    }
}

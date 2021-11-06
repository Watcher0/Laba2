package Moves;

import ru.ifmo.se.pokemon.*;

public class Tri_Attack extends SpecialMove{
    public Tri_Attack(){
        super(Type.NORMAL, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        boolean chance = new Randomiser().getChance(0.2);
        if (chance){
            Effect.freeze(pokemon); Effect.flinch(pokemon);
        }
    }
}

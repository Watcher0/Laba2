package Moves;

import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove{
    public Bubble(){
        super(Type.WATER, 40, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        boolean chance = new Randomiser().getChance(0.1);
        if (chance) {
            pokemon.setMod(Stat.SPEED, -1);
        }
    }
    @Override
    protected String describe(){
        return "использовал Bubble";
    }
}

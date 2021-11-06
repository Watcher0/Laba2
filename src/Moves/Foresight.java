package Moves;

import ru.ifmo.se.pokemon.*;

public class Foresight extends StatusMove {
    public Foresight() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, 1);
    }

    @Override
    protected String describe(){
        return "использовал Foresight";
    }
}

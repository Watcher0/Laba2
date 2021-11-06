package Moves;

import ru.ifmo.se.pokemon.*;

public class Confuse_Ray extends StatusMove{
    public Confuse_Ray(){
        super(Type.GHOST, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect.confuse(pokemon);
    }
    @Override
    protected String describe(){
        return "использовал Confuse Ray";
    }
}

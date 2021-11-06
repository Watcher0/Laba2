package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Solar_Beam extends SpecialMove {
    public Solar_Beam(){
        super(Type.GRASS, 120, 100);
    }

    @Override
    protected String describe(){
        return "использовал Solar Beam";
    }
}

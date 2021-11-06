package Creatures;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Yanma extends Pokemon {
    public Yanma (String name, int level){
        super(name, level);
        setType(Type.BUG, Type.FLYING);
        setStats(65, 65, 45, 75, 45, 95);
        setMove(new Foresight(), new Outrage(), new Ice_Punch());
    }
}

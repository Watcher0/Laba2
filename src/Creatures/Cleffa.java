package Creatures;

import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Cleffa extends Pokemon {
    public Cleffa (String name, int level){
        super(name, level);
        setType(Type.FAIRY);
        setStats(50, 25, 28, 45, 55, 15);
        setMove(new Take_Down(), new Teeter_Dance());
    }
}

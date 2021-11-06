package Creatures;

import Moves.*;

public class Yanmega extends Yanma {
    public Yanmega (String name, int level){
        super(name, level);
        setStats(86, 76, 86, 116, 56, 95);
        addMove(new Solar_Beam());
    }
}

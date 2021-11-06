package Creatures;

import Moves.*;

public class Clefable extends Clefairy{
    public Clefable (String name, int level){
        super(name, level);
        setStats(95, 70, 73, 95, 90, 60);
        addMove(new Metronome());
    }
}

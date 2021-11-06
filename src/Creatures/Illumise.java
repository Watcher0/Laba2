package Creatures;

import Moves.*;
import ru.ifmo.se.pokemon.*;


public class Illumise extends Pokemon{
    public Illumise (String name, int level){
        super(name, level);
        setType(Type.BUG);
        setStats(65, 47, 75, 73, 85, 85);
        setMove(new Confuse_Ray(), new Tri_Attack(), new Bubble(), new Foresight());
    }
}

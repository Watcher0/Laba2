package Moves;

import ru.ifmo.se.pokemon.*;

public class Outrage extends PhysicalMove {
    public Outrage() {
        super(Type.DRAGON, 120, 100);
    }
    @Override protected void applyOppEffects(Pokemon pokemon) {
        double hp = pokemon.getStat(Stat.HP);
        hp = hp - 120*3;
        pokemon.setMod(Stat.HP, (int) hp);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }
}
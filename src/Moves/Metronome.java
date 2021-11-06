package Moves;

import ru.ifmo.se.pokemon.*;

public class Metronome extends StatusMove {
    public Metronome() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.paralyze(pokemon);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
    @Override
    protected String describe(){
      return "использовал Metronome";
    }
}

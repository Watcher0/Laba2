import Creatures.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 4);
        Pokemon p2 = new Pokemon("Хищник", 2);
        Pokemon p3 = new Illumise("Инопрешеленец", 1);
        Pokemon p4 = new Yanma("Лох позорный", 3);
        Pokemon p5 = new Yanmega("Старший", 5);
        Pokemon p6 = new Cleffa("Я, пришедший в ИТМО", 1);
        Pokemon p7 = new Clefairy("Второкурсник", 3);
        Pokemon p8 = new Clefable("Я (офигенен)", 6);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addAlly(p4);
        b.addFoe(p5);
        b.addFoe(p7);
        b.addAlly(p6);
        b.addAlly(p8);
        b.go();
    }
}

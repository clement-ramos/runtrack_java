package Jour1.Job05;
import java.util.Random;

import Jour1.Job02.Voiture;

public class Des {
    Random rand = new Random();
    private int Value = rand.nextInt(6) + 1;

    public int getValue() {
        return Value;
    }
}

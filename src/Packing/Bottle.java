package Packing;

import Interfaces.Packing;

/**
 * @author danushka
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Packing.Bottle";
    }
}

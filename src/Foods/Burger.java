package Foods;

import Interfaces.Item;
import Interfaces.Packing;
import Packing.Wrapper;

/**
 * @author danushka
 */
public abstract class Burger implements Item {
    @Override
    public Packing Packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

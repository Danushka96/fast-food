package Foods;

import Interfaces.Item;
import Interfaces.Packing;
import Packing.Bottle;

/**
 * @author danushka
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing Packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

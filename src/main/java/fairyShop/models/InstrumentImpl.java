package fairyShop.models;

import static fairyShop.common.ExceptionMessages.INSTRUMENT_POWER_LESS_THAN_ZERO;

public class InstrumentImpl implements Instrument{

    private int power;

    public InstrumentImpl(int power) {
        this.power = power;
    }

    public void setPower() {
        if (this.power < 0) {
            throw new IllegalArgumentException(INSTRUMENT_POWER_LESS_THAN_ZERO);
        }
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public void use() {
        if (power - 10 <0) {
            power = 0;
        } else {
            power -= 10;
        }
    }

    @Override
    public boolean isBroken() {
        if (power == 0) {
            return  true;
        }
        return false;
    }
}

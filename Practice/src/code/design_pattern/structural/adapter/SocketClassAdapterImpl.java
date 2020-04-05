package code.design_pattern.structural.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolts(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolts(v, 40);
    }

    private Volt convertVolts(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}

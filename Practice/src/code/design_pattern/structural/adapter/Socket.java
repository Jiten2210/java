package code.design_pattern.structural.adapter;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}

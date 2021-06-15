package RendelesDecorator;

public class Kedvezmeny10 extends RendelesDecorator{

    public Kedvezmeny10(Rendeles decoratedRendeles) {
        super(decoratedRendeles);
    }

    public double getAr() {
        return super.getAr() * 0.9;
    }

    public String getArmodositoTipus() {
        return super.getArmodositoTipus()  + "10% kedvezmény";
    }

}

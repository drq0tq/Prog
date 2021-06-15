package RendelesDecorator;

public class Kedvezmeny20 extends RendelesDecorator{

    public Kedvezmeny20(Rendeles decoratedRendeles) {
        super(decoratedRendeles);
    }

    public double getAr() {
        return super.getAr() * 0.8;
    }

    public String getArmodositoTipus() {
        return super.getArmodositoTipus()  + "20% kedvezmény";
    }
}

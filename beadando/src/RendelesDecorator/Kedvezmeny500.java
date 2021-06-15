package RendelesDecorator;

public class Kedvezmeny500 extends RendelesDecorator{
    public Kedvezmeny500(Rendeles decoratedRendeles) {
        super(decoratedRendeles);
    }

    public double getAr() {
        return super.getAr() - 500;
    }

    public String getArmodositoTipus() {
        return super.getArmodositoTipus()  + "500Ft kedvezmény";
    }
}

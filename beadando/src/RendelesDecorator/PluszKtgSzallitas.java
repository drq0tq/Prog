package RendelesDecorator;

public class PluszKtgSzallitas extends RendelesDecorator{
    public PluszKtgSzallitas(Rendeles decoratedRendeles) {
        super(decoratedRendeles);
    }

    public double getAr() {
        return super.getAr() + 200;
    }

    public String getArmodositoTipus() {
        return super.getArmodositoTipus()  + "szállítás";
    }
}

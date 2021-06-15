package RendelesDecorator;

public abstract class RendelesDecorator extends Rendeles{

    protected  Rendeles decoratedRendeles;


    public RendelesDecorator(Rendeles decoratedRendeles) {
        this.decoratedRendeles = decoratedRendeles;
    }

    protected RendelesDecorator() {
    }

    public double getAr() { // implementing methods of the abstract class
        return decoratedRendeles.getAr();
    }

    public String getArmodositoTipus() {
        return decoratedRendeles.getArmodositoTipus();
    }
}


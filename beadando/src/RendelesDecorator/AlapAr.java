package RendelesDecorator;

import TermekFactory.Retes;

import java.util.List;

public class AlapAr extends Rendeles {
    private int ar;

    private List<Retes> list;
    public AlapAr(List<Retes> list){
        this.list = list;
        this.ar = 500 * this.list.size();
    }
    public double getAr() {
        return ar;
    }

    public String getArmodositoTipus() {
        return "";
    }
}

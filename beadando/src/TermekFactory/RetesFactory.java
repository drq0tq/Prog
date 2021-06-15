package TermekFactory;

public class RetesFactory {
    public Retes createRetes (String retes){
        switch(retes){
            case "makos": return new MakosRetes();
            case "turos": return new TurosRetes();
            case "almas": return new AlmasRetes();
            default: return null;
        }
    }
}

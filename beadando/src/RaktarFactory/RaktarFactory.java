package RaktarFactory;


public class RaktarFactory {
    public Raktar createRaktar (String raktar){
        switch(raktar){

            case "hutott": return new HutottRaktar();
            case "fedett": return new FedettRaktar();
            case "nyitott": return new NyitottRaktar();

            default: return null;
        }
    }
}

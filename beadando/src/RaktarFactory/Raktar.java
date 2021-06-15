package RaktarFactory;

public abstract class Raktar {
    public void keszit(){
        TelekVasarlas();
        RaktarEpites();
        RaktarUzembehelyezese();

    }
    private void TelekVasarlas(){
        System.out.println("Megvasároljuk a telket.");

    }

    protected abstract void RaktarEpites(); //absztrakt mert majd a gyerekosztályban felülírjuk

    private void RaktarUzembehelyezese(){
        System.out.println("A raktárat üzembehelyezzuk.");
    }

}

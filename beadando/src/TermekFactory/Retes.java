package TermekFactory;

public abstract class Retes {
        public void keszit(){
            TesztaKeszit();
            TesztaNyujt();
            ToltelekHozzaad();
            RetesSut();
            RetesCsomagol();
        }
    private void TesztaKeszit(){
        System.out.println("Begyúrom a tésztát a réteshez.");
    }
    private void TesztaNyujt(){
        System.out.println("Kinyújtom a tésztát.");
    }
        protected abstract void ToltelekHozzaad(); //absztrakt mert majd a gyerekosztályban felülírjuk

    private void RetesSut(){
        System.out.println("Beteszem a sütőbe a rétest és megsütöm.");
    }

        private void RetesCsomagol(){
            System.out.println("Az elkészült rétest csomagolom.");
        }

    }

public class Piletimüük {
    private Kontsert kontserdiPealkiri;
    private int piletiHind;
    //private int soovitudPiletiteArv;
    //private int ridadeArv;
    //private int kohtadeArv;

    public Piletimüük(Kontsert kontserdiPealkiri, int piletiHind) {
        this.kontserdiPealkiri = kontserdiPealkiri;
        this.piletiHind = piletiHind;
    }

    public Kontsert getKontserdiPealkiri() {
        return kontserdiPealkiri;
    }

    public void setKontserdiPealkiri(Kontsert kontserdiPealkiri) {
        this.kontserdiPealkiri = kontserdiPealkiri;
    }

    public int getPiletiHind() {
        return piletiHind;
    }

    public void setPiletiHind(int piletiHind) {
        this.piletiHind = piletiHind;
    }

    public int piletiteMaksumus(int piletiHind, int x){
        int summa = piletiHind *x;
        return summa;
    }

}

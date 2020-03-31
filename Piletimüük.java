public class Piletimüük {
    private Kontsert kontserdiPealkiri;
    //private int soovitudPiletiteArv;
    private int ridadeArv;
    private int kohtadeArv;

    public Piletimüük(Kontsert kontserdiPealkiri, int ridadeArv, int kohtadeArv) {
        this.kontserdiPealkiri = kontserdiPealkiri;
        //this.soovitudPiletiteArv = soovitudPiletiteArv;
        this.ridadeArv = ridadeArv;
        this.kohtadeArv = kohtadeArv;
    }

    public Kontsert getKontserdiPealkiri() {
        return kontserdiPealkiri;
    }

    public void setKontserdiPealkiri(Kontsert kontserdiPealkiri) {
        this.kontserdiPealkiri = kontserdiPealkiri;
    }

    public int getRidadeArv() {
        return ridadeArv;
    }

    public void setRidadeArv(int ridadeArv) {
        this.ridadeArv = ridadeArv;
    }

    public int getKohtadeArv() {
        return kohtadeArv;
    }

    public void setKohtadeArv(int kohtadeArv) {
        this.kohtadeArv = kohtadeArv;
    }
}

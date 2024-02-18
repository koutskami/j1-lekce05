package cz.czechitas.lekce5;

public class Osoba {
    private String soukromyMail;
    private String pracovniMail;
    private Adresa adresa;

    public String getSoukromyMail() {
        return soukromyMail;
    }

    public void setSoukromyMail(String soukromyMail) {
        this.soukromyMail = soukromyMail;
    }

    public String getPracovniMail() {
        return pracovniMail;
    }

    public void setPracovniMail(String pracovniMail) {
        this.pracovniMail = pracovniMail;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }
}

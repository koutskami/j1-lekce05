package cz.czechitas.lekce5;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Adresa {
    private String ulice;
    private String castObce;
    private String obec;
    private String psc;

    //settery nesmí být null a nesmí být prázdný string
    public String getUlice() {
        return ulice;
    }
    public void setUlice(String ulice) {
        Objects.requireNonNull(ulice);
        if (ulice.isBlank()) {
            System.err.println("Ulice nemůže být prázdná.");
            return;
        }
        this.ulice = ulice;
        }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        Objects.requireNonNull(obec);
        if (obec.isBlank()) {
            System.err.println("Obec nemůže být prázdná.");
            return;
        }
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        Objects.requireNonNull(psc);
        String regex = "^[a-zA-Z'-]+$";

        if (psc.isBlank()) {
            System.err.println("PSČ nemůže být prázdné.");
            return;
        }
        if (psc.matches(regex)) {
            System.err.println("PSČ musí obsahovat pouze čísla."); //nemuzu prijit na to, jak osetrit kombinovany pripad např. "hjk11"
        }
        else if (psc.length() != 5) {
            System.err.println("PSČ musí mít přesně 5 znaků.");
        }else {
            this.psc = psc;
        }
    }
}

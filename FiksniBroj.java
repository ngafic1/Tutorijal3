package ba.unsa.etf.rpr.tutorijal_3;


public class FiksniBroj extends TelefonskiBroj {
    public enum Grad {
        BUGOJNO("030"), ODZAK("031"), BREZA("032"), SARAJEVO("033"), LIVNO("034"), TUZLA("035"), MOSTAR("036"), BIHAC("037"),
        GORAZDE("038"), SIROKI_BRIJEG("039"), BRCKO("049"), MRKONJIC_GRAD("050"), BANJA_LUKA("051"), PRIJEDOR("052"), DOBOJ("053"),
        BOSANSKI_SAMAC("054"), BIJELJINA("055"), ZVORNIK("056"), PALE("057"), FOCA("058"), TREBINJE("059");
        private final String kod;
        Grad(String k) { kod = k;}
        public String getKod() {return kod;}
    }
    private Grad grad;
    private String broj;
    FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }
    @Override
    public final String ispisi() {return grad.getKod() + "/" + broj; }

    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiksniBroj that = (FiksniBroj) o;

        if (grad != that.grad) {
            return false;
        }
        return broj != null ? broj.equals(that.broj) : that.broj == null;
    }

    @Override
    public final int hashCode() {
        int result = grad != null ? grad.hashCode() : 0;
        result = 31 * result + (broj != null ? broj.hashCode() : 0);
        return result;
    }

    @Override
    public final int compareTo(Object o) {
        if(o instanceof FiksniBroj) {
            FiksniBroj fiksniBroj = (FiksniBroj) o;
            String prvi = this.ispisi(), drugi = fiksniBroj.ispisi();
            return prvi.compareTo(drugi);
        }
        return 0;
    }
}
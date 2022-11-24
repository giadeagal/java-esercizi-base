public class ContoCorrente {
    private String codice;
    private Persona intestatario;
    private int saldo;
    private String valuta;
    private int numeroMovimenti;
    private Movimento[] listaMovimenti;

    //COSTRUTTORI
    public ContoCorrente (String codice, Persona intestatario, String valuta) {
        this.codice = codice;
        this.intestatario = intestatario;
        this.saldo = 0;
        this.numeroMovimenti = 0;
    }
    
    public ContoCorrente (String codice, Persona intestatario, String valuta, int saldo) {
        this.codice = codice;
        this.intestatario = intestatario;
        this.saldo = saldo;
        this.numeroMovimenti = 0;
    }

    public ContoCorrente (String codice, Persona intestatario, String valuta, int saldo, int numeroMovimenti) {
        this.codice = codice;
        this.intestatario = intestatario;
        this.saldo = saldo;
        this.numeroMovimenti = numeroMovimenti;
    }

    //GETTERS
    public String getCodice() {
        return this.codice;
    }

    public Persona getIntestatario() {
        return this.intestatario;
    }

    public String getValuta() {
        return this.valuta;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public int getNumeroMovimenti() {
        return this.numeroMovimenti;
    }

    public Movimento[] getListaMovimenti() {
        return this.listaMovimenti;
    }

    //SETTERS
    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setIntestatario(Persona intestatario) {
        this.intestatario = intestatario;
    }

    //METODI
    public void prelievo(int somma) {
        if (somma > this.saldo) {
            System.out.println("HEHE, no.");
        } else if (somma < 0) {
            System.out.println("Usa la funzione deposito per versare denaro");
        } else {
            System.out.println("Spendili coscienziosamente.");
            this.saldo -= somma;
            numeroMovimenti++; //come lo metto nel costruttore del movimento?
            Movimento prelievo = 
        }
    }
}


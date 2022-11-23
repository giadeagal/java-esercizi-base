public class ContoCorrente {
    private String codice;
    private Persona intestatario;
    private int saldo;
    private int numeroMovimenti;
    private Movimento[] listaMovimenti;

    //COSTRUTTORI
    public ContoCorrente (String codice, Persona intestatario) {
        this.codice = codice;
        this.intestatario = intestatario;
        this.saldo = 0;
        this.numeroMovimenti = 0;
    }
    
    public ContoCorrente (String codice, Persona intestatario, int saldo) {
        this.codice = codice;
        this.intestatario = intestatario;
        this.saldo = saldo;
        this.numeroMovimenti = 0;
    }

    public ContoCorrente (String codice, Persona intestatario, int saldo, int numeroMovimenti) {
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

    public int getSaldo() {
        return this.saldo;
    }

    public int getNumeroMovimenti() {
        return this.numeroMovimenti;
    }

    public Movimento[] getListaMovimenti() {
        return this.listaMovimenti;
    }
}

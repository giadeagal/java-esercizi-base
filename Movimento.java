public class Movimento {
    private int codice;
    private boolean isExtraEU;
    private Persona richiedente;
    private Persona beneficiario;
    private int somma;

    public Movimento(int codice, boolean isExtraEU, Persona richiedente, Persona beneficiario, int somma) {
        this.codice = codice;
        this.isExtraEU = isExtraEU;
        this.richiedente = richiedente;
        this.beneficiario = beneficiario;
        this.somma = somma;
    }


}

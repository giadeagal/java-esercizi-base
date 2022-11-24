public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private String cf;

    //COSTRUTTORI
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public Persona(String nome, String cognome, int eta, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.cf = cf;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getCognogme() {
        return cognome;
    }

    public int geteta() {
        return eta;
    }

    public String getcf() {
        return cf;
    }
}

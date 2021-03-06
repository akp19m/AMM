package newpackage;

/**
 *
 * @author Pili
 */
public class Users {

    protected int id;
    protected String nome;
    protected String cognome;
    private String username;
    private String password;
    private Conto conto;

    /* Costruttore */
    public Users() {
        id = 0;
        nome = "";
        cognome = "";
        username = "";
        password = "";
        conto = new Conto();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the conto
     */
    public Conto getConto() {
        return conto;
    }

    /**
     * @param conto the conto to set
     */
    public void setConto(Conto conto) {
        this.conto = conto;
    }

}

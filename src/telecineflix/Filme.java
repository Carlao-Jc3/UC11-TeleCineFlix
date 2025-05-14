package telecineflix;

import java.sql.Date;

public class Filme {
    private int id;
    private String nome;
    private Date dataLancamento;
    private String categoria;

    /**
     * Construtor padrão.
     */
    public Filme() {}

    /**
     * Construtor com parâmetros.
     * @param id Identificador único do filme
     * @param nome Nome do filme
     * @param dataLancamento Data de lançamento do filme
     * @param categoria Categoria do filme
     */
    public Filme(int id, String nome, Date dataLancamento, String categoria) {
        this.id = id;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Date getDataLancamento() { return dataLancamento; }
    public void setDataLancamento(Date dataLancamento) { this.dataLancamento = dataLancamento; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}

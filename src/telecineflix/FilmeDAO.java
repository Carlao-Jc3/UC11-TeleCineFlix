package telecineflix;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {
    
    /**
     * Insere um novo filme no banco de dados.
     *
     * @param filme Objeto Filme contendo os dados a serem inseridos
     * @throws SQLException se houver erro na execução da query
     * @throws IllegalArgumentException se os dados do filme forem inválidos (nulos ou vazios)
     */
    public void inserir(Filme filme) throws SQLException {
        if (filme == null || filme.getNome() == null || filme.getNome().trim().isEmpty() ||
            filme.getDataLancamento() == null || filme.getCategoria() == null || filme.getCategoria().trim().isEmpty()) {
            throw new IllegalArgumentException("Dados do filme inválidos: nome, data de lançamento e categoria são obrigatórios.");
        }
        String sql = "INSERT INTO filmes (nome, datalancamento, categoria) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, filme.getNome());
            stmt.setDate(2, filme.getDataLancamento());
            stmt.setString(3, filme.getCategoria());
            stmt.executeUpdate();
        }
    }
    
    /**
     * Lista todos os filmes cadastrados no banco de dados.
     *
     * @return Lista de objetos Filme
     * @throws SQLException se houver erro na execução da query
     */
    public List<Filme> listarTodos() throws SQLException {
        List<Filme> filmes = new ArrayList<>();
        String sql = "SELECT * FROM filmes";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setNome(rs.getString("nome"));
                filme.setDataLancamento(rs.getDate("datalancamento"));
                filme.setCategoria(rs.getString("categoria"));
                filmes.add(filme);
            }
        }
        return filmes;
    }

    /**
     * Lista filmes filtrados por categoria, suportando buscas parciais.
     *
     * @param categoria Nome ou parte do nome da categoria
     * @return Lista de objetos Filme que correspondem à categoria
     * @throws SQLException se houver erro na execução da query
     * @throws IllegalArgumentException se a categoria for nula ou vazia
     */
    public List<Filme> listarPorCategoria(String categoria) throws SQLException {
        if (categoria == null || categoria.trim().isEmpty()) {
            throw new IllegalArgumentException("Categoria não pode ser nula ou vazia.");
        }
        List<Filme> filmes = new ArrayList<>();
        String sql = "SELECT * FROM filmes WHERE categoria LIKE ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + categoria + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Filme filme = new Filme();
                    filme.setId(rs.getInt("id"));
                    filme.setNome(rs.getString("nome"));
                    filme.setDataLancamento(rs.getDate("datalancamento"));
                    filme.setCategoria(rs.getString("categoria"));
                    filmes.add(filme);
                }
            }
        }
        return filmes;
    }

    /**
     * Atualiza os dados de um filme existente no banco de dados.
     *
     * @param filme Objeto Filme com os dados atualizados
     * @throws SQLException se houver erro na execução da query
     * @throws IllegalArgumentException se os dados do filme forem inválidos (nulos, vazios ou ID inválido)
     */
    public void atualizar(Filme filme) throws SQLException {
        if (filme == null || filme.getId() <= 0 || filme.getNome() == null || filme.getNome().trim().isEmpty() ||
            filme.getDataLancamento() == null || filme.getCategoria() == null || filme.getCategoria().trim().isEmpty()) {
            throw new IllegalArgumentException("Dados do filme inválidos: ID, nome, data de lançamento e categoria são obrigatórios.");
        }
        String sql = "UPDATE filmes SET nome = ?, datalancamento = ?, categoria = ? WHERE id = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, filme.getNome());
            stmt.setDate(2, filme.getDataLancamento());
            stmt.setString(3, filme.getCategoria());
            stmt.setInt(4, filme.getId());
            stmt.executeUpdate();
        }
    }

    /**
     * Exclui um filme do banco de dados com base no ID.
     *
     * @param id ID do filme a ser excluído
     * @throws SQLException se houver erro na execução da query
     * @throws IllegalArgumentException se o ID for inválido (menor ou igual a zero)
     */
    public void excluir(int id) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("ID inválido: deve ser maior que zero.");
        }
        String sql = "DELETE FROM filmes WHERE id = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}


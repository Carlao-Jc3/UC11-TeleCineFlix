package telecineflix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável por gerenciar a conexão com o banco de dados MySQL para o sistema Cenaflix.
 * @author Carlos Eduardo Henrique Garibaldi
 * @version 2.0
 */
public class Conexao {
    private static Connection conn; // Conexão estática para garantir uma única instância

    /**
     * Estabelece uma conexão com o banco de dados cenaflix_bd.
     * @return Objeto Connection se a conexão for bem-sucedida
     * @throws SQLException Se houver erro ao conectar ao banco
     */
    public static Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/cenaflix_bd", "root", "CAmysql2025DU");
                System.out.println("Conexão estabelecida com sucesso!");
            } catch (ClassNotFoundException e) {
                throw new SQLException("Driver JDBC do MySQL não encontrado: " + e.getMessage());
            } catch (SQLException e) {
                throw new SQLException("Erro ao conectar ao banco de dados: " + e.getMessage());
            }
        }
        return conn;
    }

    /**
     * Fecha a conexão com o banco de dados, se estiver aberta.
     * @throws SQLException Se houver erro ao fechar a conexão
     */
    public static void closeConnection() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            System.out.println("Conexão fechada com sucesso!");
        }
    }
}
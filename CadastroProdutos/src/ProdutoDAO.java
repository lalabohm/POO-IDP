import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class ProdutoDAO {
    private Connection connection;

    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserir(Produto produto) throws SQLException {
        String sql = "INSERT INTO produto (tipo, descricao, peso, quantidade, unidade_medida) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getTipo());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPeso());
            stmt.setInt(4, produto.getQuantidade());
            stmt.setString(5, produto.getUnidadeMedida());
            stmt.executeUpdate();
        }
    }

    public void atualizar(int id, Produto produto) throws SQLException {
        String sql = "UPDATE produto SET tipo=?, descricao=?, peso=?, quantidade=?, unidade_medida=? WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getTipo());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPeso());
            stmt.setInt(4, produto.getQuantidade());
            stmt.setString(5, produto.getUnidadeMedida());
            stmt.setInt(6, id);
            stmt.executeUpdate();
        }
    }

    public void excluir(int id) throws SQLException {
        String sql = "DELETE FROM produto WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Produto produto = new Produto(
                        rs.getInt("id"),
                        rs.getString("tipo"),
                        rs.getString("descricao"),
                        rs.getDouble("peso"),
                        rs.getInt("quantidade"),
                        rs.getString("unidade_medida")
                );
                produtos.add(produto);
            }
        }
        return produtos;
    }

    public Produto buscarPorId(int id) throws SQLException {
        String sql = "SELECT * FROM produto WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Produto(
                            rs.getInt("id"),
                            rs.getString("tipo"),
                            rs.getString("descricao"),
                            rs.getDouble("peso"),
                            rs.getInt("quantidade"),
                            rs.getString("unidade_medida")
                    );
                }
            }
        }
        return null;
    }
}




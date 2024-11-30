import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String user = "meu_usuario";
        String password = "minha_senha";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            ProdutoDAO produtoDAO = new ProdutoDAO(connection);

            produtoDAO.inserir(new Produto("Informática", "Notebook Dell", 1.5, 10, "kg"));
            produtoDAO.inserir(new Produto("Limpeza", "Sabão em Pó", 2.0, 50, "kg"));
            produtoDAO.inserir(new Produto("Casa & Decoração", "Vaso decorativo", 3.0, 20, "kg"));
            produtoDAO.inserir(new Produto("Alimentos", "Leite", 1.0, 30, "litro"));
            produtoDAO.inserir(new Produto("Construção", "Tubo PVC", 2.5, 15, "metro"));

            produtoDAO.atualizar(1, new Produto("Informática", "Notebook Acer", 2.0, 8, "kg"));
            produtoDAO.atualizar(2, new Produto("Limpeza", "Detergente Líquido", 1.0, 60, "litro"));

            produtoDAO.excluir(5);

            List<Produto> produtos = produtoDAO.listar();
            produtos.forEach(System.out::println);

            System.out.println(produtoDAO.buscarPorId(1));
            System.out.println(produtoDAO.buscarPorId(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package br.com.minhaempresa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testCriacaoProduto() {
        Produto produto = new Produto("Produto A", 10.0);
        assertEquals("Produto A", produto.getNome());
        assertEquals(10.0, produto.getPreco());
    }

    @Test
    void testEquals() {
        Produto produto1 = new Produto("Produto A", 10.0);
        Produto produto2 = new Produto("Produto A", 15.0);
        assertEquals(produto1, produto2, "Produtos com o mesmo nome devem ser considerados iguais");
    }

    @Test
    void testHashCode() {
        Produto produto1 = new Produto("Produto A", 10.0);
        Produto produto2 = new Produto("Produto A", 15.0);
        assertEquals(produto1.hashCode(), produto2.hashCode(), "Produtos com o mesmo nome devem ter o mesmo hashCode");
    }

    @Test
    void testCompareTo() {
        Produto produto1 = new Produto("Produto A", 10.0);
        Produto produto2 = new Produto("Produto B", 15.0);
        assertTrue(produto1.compareTo(produto2) < 0, "Produto A deve ser menor que Produto B no compareTo");
    }
}

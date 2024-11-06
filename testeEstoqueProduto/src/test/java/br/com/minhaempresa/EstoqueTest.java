package br.com.minhaempresa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {
    private Estoque estoque;

    @BeforeEach
    void setUp() {
        estoque = new Estoque();
    }

    @Test
    void testAdicionarProduto() {
        Produto produto = new Produto("Produto A", 10.0);
        assertTrue(estoque.adicionarProduto(produto));
    }

    @Test
    void testAdicionarProdutoDuplicado() {
        Produto produto = new Produto("Produto A", 10.0);
        estoque.adicionarProduto(produto);
        assertFalse(estoque.adicionarProduto(produto), "Não deve permitir adicionar produto duplicado");
    }

    @Test
    void testRemoverProdutoExistente() {
        Produto produto = new Produto("Produto A", 10.0);
        estoque.adicionarProduto(produto);
        assertTrue(estoque.removerProduto("Produto A"));
    }

    @Test
    void testRemoverProdutoInexistente() {
        assertFalse(estoque.removerProduto("Produto Inexistente"));
    }

    @Test
    void testBuscarProdutoExistente() {
        Produto produto = new Produto("Produto A", 10.0);
        estoque.adicionarProduto(produto);
        assertNotNull(estoque.buscarProduto("Produto A"));
    }

    @Test
    void testBuscarProdutoInexistente() {
        assertNull(estoque.buscarProduto("Produto Inexistente"));
    }

    @Test
    void testListarProdutos() {
        Produto produto1 = new Produto("Produto A", 10.0);
        Produto produto2 = new Produto("Produto B", 15.0);
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        assertEquals(2, estoque.listarProdutos().size());
    }
}

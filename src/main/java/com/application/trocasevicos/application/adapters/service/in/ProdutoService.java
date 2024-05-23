package com.application.trocasevicos.application.adapters.service.in;

import com.application.trocasevicos.domain.Produto;

import java.util.List;

public interface ProdutoService {
    Produto criarProduto(Produto produto);
    List<Produto> listarProdutos();
    Produto obterProdutoPorId(Long id);
    Produto atualizarProduto(Long id, Produto produto);
    void deletarProduto(Long id);
}

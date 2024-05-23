package com.application.trocasevicos.application.adapters.service.out;

import com.application.trocasevicos.domain.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository {
    Produto salvar(Produto produto);
    List<Produto> buscarTodos();
    Optional<Produto> buscarPorId(Long id);
    void deletarPorId(Long id);
}

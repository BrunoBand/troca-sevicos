package com.application.trocasevicos.infrastructure.repository;

import com.application.trocasevicos.application.adapters.service.out.ProdutoRepository;
import com.application.trocasevicos.domain.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ProdutoRepositoryImpl implements ProdutoRepository {

    private final ConcurrentHashMap<Long, Produto> database = new ConcurrentHashMap<>();
    private Long currentId = 1L;

    @Override
    public Produto salvar(Produto produto) {
        if (produto.getId() == null) {
            produto.setId(currentId++);
        }
        database.put(produto.getId(), produto);
        return produto;
    }

    @Override
    public List<Produto> buscarTodos() {
        return new ArrayList<>(database.values());
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return Optional.ofNullable(database.get(id));
    }

    @Override
    public void deletarPorId(Long id) {
        database.remove(id);
    }
}

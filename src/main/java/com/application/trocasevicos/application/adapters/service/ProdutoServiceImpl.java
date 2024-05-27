package com.application.trocasevicos.application.adapters.service;

import com.application.trocasevicos.application.adapters.service.in.ProdutoService;
import com.application.trocasevicos.application.adapters.service.out.ProdutoRepository;
import com.application.trocasevicos.domain.Produto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto criarProduto(Produto produto) {
        return produtoRepository.salvar(produto);
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtoRepository.buscarTodos();
    }

    @Override
    public Produto obterProdutoPorId(Long id) {
        Optional<Produto> produto = produtoRepository.buscarPorId(id);
        return produto.orElse(null);
    }

    @Override
    public Produto atualizarProduto(Long id, Produto produto) {
        if (produtoRepository.buscarPorId(id).isPresent()) {
            produto.setId(id);
            return produtoRepository.salvar(produto);
        }
        return null;
    }

    @Override
    public void deletarProduto(Long id) {
        produtoRepository.deletarPorId(id);
    }
}

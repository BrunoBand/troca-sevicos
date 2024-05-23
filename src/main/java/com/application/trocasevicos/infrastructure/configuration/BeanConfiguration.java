package com.application.trocasevicos.infrastructure.configuration;

import com.application.trocasevicos.application.adapters.service.ProdutoServiceImpl;
import com.application.trocasevicos.application.adapters.service.out.ProdutoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public ProdutoServiceImpl produtoServiceImpl(ProdutoRepository produtoRepository) {
        return new ProdutoServiceImpl(produtoRepository);
    }
}

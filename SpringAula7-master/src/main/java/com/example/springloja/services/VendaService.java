package com.example.springloja.services;


import com.example.springloja.entities.Venda;
import com.example.springloja.repositories.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    public List<Venda> listar() {
        return repository.findAll();
    }

    public Venda buscar(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void salvar(Venda Venda) {
        repository.save(Venda);
    }

    public void atualizar(Venda Venda) {
        repository.save(Venda);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
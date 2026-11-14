package com.example.springloja.services;


import com.example.springloja.entities.Vendedor;
import com.example.springloja.repositories.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorService {

    @Autowired
    private VendedorRepository repository;

    public List<Vendedor> listar() {
        return repository.findAll();
    }

    public Vendedor buscar(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void salvar(Vendedor Vendedor) {
        repository.save(Vendedor);
    }

    public void atualizar(Vendedor Vendedor) {
        repository.save(Vendedor);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
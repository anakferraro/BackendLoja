package com.example.springloja.services;


import com.example.springloja.entities.Cliente;
import com.example.springloja.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente buscar(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void salvar(Cliente Cliente) {
        repository.save(Cliente);
    }

    public void atualizar(Cliente Cliente) {
        repository.save(Cliente);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
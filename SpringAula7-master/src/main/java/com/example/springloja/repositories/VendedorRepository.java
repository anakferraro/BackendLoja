package com.example.springloja.repositories;

import com.example.springloja.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
}

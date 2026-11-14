package com.example.springloja.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID único da Vendedor gerado pelo banco", example = "1")
    private Long id;

    @NotBlank(message = "O nome não pode estar em branco")
    @Schema(description = "Nome da Vendedor", example = "Carlos")
    private String nome;

    @Schema(description = "Foto do vendedor", example = "carlos.jpg")
    private String foto;

    public Vendedor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() { return foto; }

    public void setFoto(String foto) {this.foto = foto; }
}


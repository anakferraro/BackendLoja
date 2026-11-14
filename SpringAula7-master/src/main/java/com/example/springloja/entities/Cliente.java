package com.example.springloja.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID único da Cliente gerado pelo banco", example = "1")
    private Long id;

    @NotBlank(message = "O nome não pode estar em branco")
    @Schema(description = "Nome da Cliente", example = "João")
    private String nome;

    @NotNull(message = "A renda é obrigatória")
    @DecimalMin(value = "0.0", message = "A renda não pode ser negativa")
    @Schema(description = "Renda do cliente", example = "2500.00")
    private Float renda;

    public Cliente() {
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

    public Float getRenda() { return renda; }

    public void setRenda(Float renda) { this.renda = renda; }
}

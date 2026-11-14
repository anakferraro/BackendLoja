package com.example.springloja.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID único da Venda gerado pelo banco", example = "1")
    private Long id;

    @NotNull(message = "A data é obrigatória")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Schema(description = "Data de venda", example = "13/11/2026")
    private LocalDate data;

    @NotNull(message = "O valor é obrigatório")
    @DecimalMin(value = "0.0", message = "O valor não pode ser negativo")
    @Schema(description = "Valor da venda", example = "150.00")
    private Double valor;

    @NotNull(message = "O cliente é obrigatório")
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @NotNull(message = "O vendedor é obrigatório")
    @ManyToOne
    @JoinColumn(name = "vendedor_id")
    private Vendedor vendedor;


    public Venda() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {return data;}

    public void setData(LocalDate data) {this.data = data;}

    public Double getValor() {return valor;}

    public void setValor(Double valor) {this.valor = valor;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public Cliente getCliente() {return cliente;}

    public void setVendedor(Vendedor vendedor) {this.vendedor = vendedor;}

    public Vendedor getVendedor() {return vendedor;}
}

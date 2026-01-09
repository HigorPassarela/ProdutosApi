package br.com.cursospring.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// POJO -> Plain Old Java Object

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @Column
    private String id;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private Double preco;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // Imprimir dados API
    @Override
    public String toString() {
        return "Produto{" +
                "preco='" + preco + '\'' +
                ", descricao='" + descricao + '\'' +
                ", nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

package br.com.apsoo.pedidos.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TB_CIDADE")
@SequenceGenerator(name = "seq_cidade")
public class Cidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CI_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_cidade")
    private Integer id;

    @Column(name = "CI_NOME")
    private String nome;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "ES_ID")
    private Estado estado;


    public Cidade() {
    }

    public Cidade(Integer id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return Objects.equals(id, cidade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

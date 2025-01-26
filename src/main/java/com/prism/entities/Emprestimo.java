package com.prism.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "LIVRO")
    private Livro livro;
    @ManyToOne
    @JoinColumn(name = "USUARIO")
    private Usuario usuario;
    @JoinColumn(name = "DATA_EMPRESTIMO")
    private Date dataEmprestimo;
    @JoinColumn(name = "DATA_DEVOLUCAO")
    private Date dataDevolucao;
}

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
    @JoinColumn(name = "livro_id")
    private Livro livro;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;
}

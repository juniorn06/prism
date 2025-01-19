package com.prism.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    private String autor;
    private Integer anoPublicacao;
    private String editora;
    private Integer numeroPaginas;
    private String titulo;
    private String isbn;
    private String genero;
}

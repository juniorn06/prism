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
    @Column(name = "AUTOR")
    private String autor;
    @Column(name = "ANO_PUBLICACAO")
    private Integer anoPublicacao;
    @Column(name = "EDITORA")
    private String editora;
    @Column(name = "NUMERO_PAGINAS")
    private Integer numeroPaginas;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "GENERO")
    private String genero;
}

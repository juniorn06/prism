package com.prism.DTO;

import java.io.Serializable;

public class LivroDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String autor;
    private Integer anoPublicacao;
    private String editora;
    private Integer numeroPaginas;
    private String titulo;
    private String isbn;
    private String genero;
}

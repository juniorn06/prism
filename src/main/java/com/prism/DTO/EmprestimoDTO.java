package com.prism.DTO;

import com.prism.entities.Livro;
import com.prism.entities.Usuario;

import java.io.Serializable;
import java.util.Date;

public class EmprestimoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;
}

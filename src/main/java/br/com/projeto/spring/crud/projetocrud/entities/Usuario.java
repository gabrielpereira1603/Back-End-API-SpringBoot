package br.com.projeto.spring.crud.projetocrud.entities;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_usuario", nullable = false)
    private Long codigoUsuario;

    @ManyToOne
    @JoinColumn(name = "profissao_fk", nullable = false)
    private Profissao profissao;

    @Column(name = "nome_usuario", nullable = false)
    private String nomeUsuario;

    @Column(name = "data_nascimento", nullable = false)
    @NotBlank(message = "A data de nascimento deve ser preenchida")
    private LocalDate dataNascimento;


}

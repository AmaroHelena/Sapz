package Sapz.Sagsa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = Aluno.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class Aluno {

    public static final String TABLE_NAME = "alunos";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "nome", length = 100, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 100)
    private String nome;

    @Column(name = "cpf", length = 14, nullable = false, unique = true)
    @NotBlank 
    @Size(min = 11, max = 14)
    private String cpf;

    @Column(name = "email", length = 150)
    @Email
    @Size(max = 150)
    private String email;

    @Column(name = "matricula", length = 50, nullable = false, unique = true)
    @NotBlank 
    @Size(min = 1, max = 50)
    private String matricula;
}
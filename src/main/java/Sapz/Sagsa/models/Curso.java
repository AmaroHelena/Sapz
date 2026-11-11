package Sapz.Sagsa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = Curso.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class Curso {

    public static final String TABLE_NAME = "cursos";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "area_tecnologica_id")
    private AreaTecnologica areaTecnologica;

    @Column(name = "nome", length = 150, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 150)
    private String nome;

    @Column(name = "tipo_curso", length = 50, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 50)
    private String tipoCurso;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo = true;
}

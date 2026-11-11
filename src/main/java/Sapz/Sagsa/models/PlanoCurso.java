package Sapz.Sagsa.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = PlanoCurso.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class PlanoCurso {

    public static final String TABLE_NAME = "planos_curso";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

    @Column(name = "codigo_plano", length = 50, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 50)
    private String codigoPlano;

    @Column(name = "versao", length = 20, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 20)
    private String versao = "1.0";

    @Column(name = "carga_horaria_total", nullable = false)
    @NotNull
    private Integer cargaHorariaTotal;

    @Column(name = "data_aprovacao")
    private LocalDate dataAprovacao;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo = true;
}
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
@Table(name = Turma.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class Turma {

    public static final String TABLE_NAME = "turmas";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "escola_id", nullable = false)
    private Escola escola;

    @ManyToOne 
    @JoinColumn(name = "plano_curso_id", nullable = false)
    private PlanoCurso planoCurso;

    @ManyToOne 
    @JoinColumn(name = "coordenador_id")
    private Usuario coordenador;

    @Column(name = "codigo_turma", length = 50, nullable = false, unique = true)
    @NotBlank 
    @Size(min = 1, max = 50)
    private String codigoTurma;

    @Column(name = "ano", nullable = false)
    @NotNull
    private Integer ano;

    @Column(name = "semestre", nullable = false)
    @NotNull
    private Integer semestre;

    @Column(name = "data_inicio", nullable = false)
    @NotNull
    private LocalDate dataInicio;

    @Column(name = "data_fim", nullable = false)
    @NotNull
    private LocalDate dataFim;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo = true;
}
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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = Modulo.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class Modulo {

    public static final String TABLE_NAME = "modulos";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "plano_curso_id", nullable = false)
    private PlanoCurso planoCurso;

    @Column(name = "nome", length = 100, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 100)
    private String nome;

    @Column(name = "tipo_modulo", length = 30, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 30)
    private String tipoModulo;

    @Column(name = "ordem", nullable = false)
    @NotNull
    private Integer ordem = 1;

    @Column(name = "carga_horaria", nullable = false)
    @NotNull
    private Integer cargaHoraria;
}
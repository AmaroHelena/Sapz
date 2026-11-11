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
@Table(name = UnidadeCurricular.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class UnidadeCurricular {

    public static final String TABLE_NAME = "unidades_curriculares";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "modulo_id", nullable = false)
    private Modulo modulo;

    @Column(name = "nome", length = 150, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 150)
    private String nome;

    @Column(name = "carga_horaria", nullable = false)
    @NotNull
    private Integer cargaHoraria;

    @Column(name = "objetivo_geral", columnDefinition = "TEXT")
    private String objetivoGeral;

    @Column(name = "ordem", nullable = false)
    @NotNull
    private Integer ordem = 1;
}
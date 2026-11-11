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
@Table(name = Capacidade.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class Capacidade {

    public static final String TABLE_NAME = "capacidades";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "unidade_curricular_id", nullable = false)
    private UnidadeCurricular unidadeCurricular;

    @Column(name = "tipo", length = 30, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 30)
    private String tipo;

    @Column(name = "dominio", length = 30, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 30)
    private String dominio;

    @Column(name = "descricao", columnDefinition = "TEXT", nullable = false)
    @NotBlank
    private String descricao;
}

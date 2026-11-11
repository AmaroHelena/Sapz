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
@Table(name = AreaTecnologica.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class AreaTecnologica {

    public static final String TABLE_NAME = "areas_tecnologicas";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @ManyToOne 
    @JoinColumn(name = "eixo_tecnologico_id", nullable = false)
    private EixoTecnologico eixoTecnologico;

    @Column(name = "nome", length = 100, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 100)
    private String nome;
}
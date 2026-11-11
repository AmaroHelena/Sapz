package Sapz.Sagsa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = EixoTecnologico.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class EixoTecnologico {

    public static final String TABLE_NAME = "eixos_tecnologicos";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "nome", length = 100, nullable = false, unique = true)
    @NotBlank 
    @Size(min = 1, max = 100)
    private String nome;
}

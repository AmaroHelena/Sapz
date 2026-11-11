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
@Table(name = Escola.TABLE_NAME)
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class Escola {

    public static final String TABLE_NAME = "escolas";

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "nome", length = 150, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 150)
    private String nome;

    @Column(name = "codigo_unidade", length = 20, unique = true)
    @Size(max = 20)
    private String codigoUnidade;

    @Column(name = "cidade", length = 100, nullable = false)
    @NotBlank 
    @Size(min = 1, max = 100)
    private String cidade;

    @Column(name = "estado", length = 2, nullable = false)
    @NotBlank 
    @Size(min = 2, max = 2)
    private String estado = "RS";

    @Column(name = "ativo", nullable = false)
    private Boolean ativo = true;
}
package Sapz.Sagsa.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class EscolaCreateDTO {

    @NotBlank(message = "O nome da escola é obrigatório") 
    @Size(min = 2, max = 150)
    private String nome;

    @Size(max = 20)
    private String codigoUnidade;

    @NotBlank(message = "A cidade é obrigatória") 
    @Size(min = 2, max = 100)
    private String cidade;

    @NotBlank(message = "O estado é obrigatório") 
    @Size(min = 2, max = 2)
    private String estado = "RS";
}
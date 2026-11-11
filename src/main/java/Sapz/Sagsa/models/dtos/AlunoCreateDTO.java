package Sapz.Sagsa.models.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class AlunoCreateDTO {

    @NotBlank(message = "O nome é obrigatório") 
    @Size(min = 2, max = 100)
    private String nome;

    @NotBlank(message = "O CPF é obrigatório") 
    @Size(min = 11, max = 14)
    private String cpf;

    @Email(message = "Formato de e-mail inválido")
    @Size(max = 150)
    private String email;

    @NotBlank(message = "A matrícula é obrigatória") 
    @Size(min = 1, max = 50)
    private String matricula;
}

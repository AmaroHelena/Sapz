package Sapz.Sagsa.models.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class UsuarioCreateDTO {

    @NotBlank(message = "O nome é obrigatório") 
    @Size(min = 2, max = 100)
    private String nome;

    @NotBlank(message = "O e-mail é obrigatório") 
    @Email(message = "Formato de e-mail inválido")
    @Size(max = 150)
    private String email;

    @NotBlank(message = "A senha é obrigatória") 
    @Size(min = 8, max = 60, message = "A senha deve ter entre 8 e 60 caracteres")
    private String senha;

    @NotNull(message = "O ID do perfil é obrigatório")
    private Long perfilId;
}
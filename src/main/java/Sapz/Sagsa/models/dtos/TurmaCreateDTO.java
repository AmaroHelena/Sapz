package Sapz.Sagsa.models.dtos;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor 
@Data 
public class TurmaCreateDTO {

    @NotNull(message = "A escola é obrigatória")
    private Long escolaId;

    @NotNull(message = "O plano de curso é obrigatório")
    private Long planoCursoId;

    // Coordenador é opcional, por isso não tem @NotNull
    private Long coordenadorId;

    @NotBlank(message = "O código da turma é obrigatório") 
    @Size(min = 1, max = 50)
    private String codigoTurma;

    @NotNull(message = "O ano é obrigatório")
    private Integer ano;

    @NotNull(message = "O semestre é obrigatório")
    private Integer semestre;

    @NotNull(message = "A data de início é obrigatória")
    private LocalDate dataInicio;

    @NotNull(message = "A data de fim é obrigatória")
    private LocalDate dataFim;
}

package Sapz.Sagsa.enums;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PerfilEnum {

    ADMINISTRADOR(1, "ROLE_ADMINISTRADOR"),
    COORDENADOR(2, "ROLE_COORDENADOR"),
    INSTRUTOR(3, "ROLE_INSTRUTOR");

    private Integer code;
    private String description;

    public static PerfilEnum toEnum(Integer code) {
        if (Objects.isNull(code)) {
            return null;
        }

        for (PerfilEnum x : PerfilEnum.values()) {
            if (code.equals(x.getCode())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Código de perfil inválido: " + code);
    }
}
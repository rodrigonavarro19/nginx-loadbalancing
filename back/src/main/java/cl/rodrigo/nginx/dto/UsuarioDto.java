package cl.rodrigo.nginx.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDto {

    private Long id;
    private String nombres;
    private String apellidos;
    private Long edad;
    private String email;

}

package cl.rodrigo.nginx.controllers;


import cl.rodrigo.nginx.dto.UsuarioDto;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/main")
@CrossOrigin("*")
public class MainController {


    @GetMapping("getAllUsuarios")
    public ResponseEntity<List<UsuarioDto>> getAllUsuarios(){
        List<UsuarioDto> usuarios = new ArrayList<>();

        UsuarioDto usuario1 = UsuarioDto.builder()
                .id(1L)
                .nombres("Rodrigo")
                .apellidos("Navarro")
                .edad(33L)
                .email("rodrigo.navarro19@gmail.com")
                .build();
        usuarios.add(usuario1);

        UsuarioDto usuario2 = UsuarioDto.builder()
                .id(2L)
                .nombres("Juan")
                .apellidos("Perez")
                .edad(30L)
                .email("juan.perez@gmail.com")
                .build();
        usuarios.add(usuario2);

        UsuarioDto usuario3 = UsuarioDto.builder()
                .id(3L)
                .nombres("Marcelo")
                .apellidos("Díaz")
                .edad(35L)
                .email("marcelo.diaz@gmail.com")
                .build();
        usuarios.add(usuario3);

        return new ResponseEntity<>(usuarios, HttpStatus.OK);

    }

}

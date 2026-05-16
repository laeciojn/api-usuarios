package br.com.laecio.api_usuario.controller;

import br.com.laecio.api_usuario.business.UsuarioService;
import br.com.laecio.api_usuario.infrastructure.entity.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario){
        Usuario salvo = usuarioService.salvaUsuario(usuario);
        return ResponseEntity.ok().body(usuario);
    }

    @GetMapping("/buscarUsuarios")
    public ResponseEntity<List<Usuario>> buscarUsuarios(){
        return ResponseEntity.ok().body(usuarioService.buscarUsuarios());
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok().body(usuarioService.atualizarUsuario(usuario));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuario(@RequestParam("id") String id){
        usuarioService.deletarUsuario(id);
        return ResponseEntity.accepted().build();
    }
}

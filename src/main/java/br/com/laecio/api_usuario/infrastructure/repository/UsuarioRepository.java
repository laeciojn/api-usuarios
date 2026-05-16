package br.com.laecio.api_usuario.infrastructure.repository;

import br.com.laecio.api_usuario.infrastructure.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}

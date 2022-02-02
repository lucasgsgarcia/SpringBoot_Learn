package br.com.springboot.domain.services;

import br.com.springboot.domain.repository.UsuariosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UsuarioDetailsService implements UserDetailsService {
    private final UsuariosRepository usuariosRepository;
    @Override
    public UserDetails loadUserByUsername(String username){
        return Optional.ofNullable(usuariosRepository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encotrado!"));
    }
}

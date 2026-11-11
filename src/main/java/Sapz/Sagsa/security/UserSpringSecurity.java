package Sapz.Sagsa.security;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserSpringSecurity implements UserDetails {

    private Long id;
    private String username; // Geralmente o email no sistema
    private String password; // Senha criptografada
    private Collection<? extends GrantedAuthority> authorities;

    public UserSpringSecurity() {
    }

    public UserSpringSecurity(Long id, String username, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    public Long getId() {
        return id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Conta não expira
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Conta não bloqueia
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Credenciais não expiram
    }

    @Override
    public boolean isEnabled() {
        return true; // Usuário está ativo
    }
}
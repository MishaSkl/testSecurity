package org.example.FirstSecurityApp.security;


import org.example.FirstSecurityApp.models.Person;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class PersonDetails implements UserDetails {

    private final Person person;

    public PersonDetails(Person person) {
        this.person = person;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.person.getPassword();
    }

    @Override
    public String getUsername() {
        return this.person.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; //акк действителен
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; //акк не заблокированный
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; //password не просрочен
    }

    @Override
    public boolean isEnabled() {
        return true; //акк включен и работает
    }

    // Нужно что-бы получать данные аутентифицированного пользователя
    public Person getPerson() {
        return this.person;
    }
}

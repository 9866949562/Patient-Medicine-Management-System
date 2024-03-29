package com.example.springboot.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.springboot.entities.User;

public class UserPrincipal implements UserDetails{

	
private User user;
	
	public UserPrincipal(User user) {
		this.user = user;
	}

	 @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        List<GrantedAuthority> authorities = new ArrayList<>();

	        user.getRoleList().forEach(r -> {
	            GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + r);
	            authorities.add(authority);
	        });

	        return authorities;
	    }

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return user.isActive();
	}

}
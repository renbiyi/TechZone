package com.techzone.core.auth;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.techzone.account.bo.SysRole;
import com.techzone.account.bo.SysUser;
import com.techzone.account.service.RoleService;
import com.techzone.account.service.UserService;

public class UserDetailServiceImpl implements UserDetailsService {

	private static Logger log = Logger.getLogger(UserDetailsService.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		
		if (log.isDebugEnabled()) {
			log.debug("username is " + username);
		}

		SysUser user = userService.findUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		
		Collection<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(user);  
        
        boolean enables = true;  
        boolean accountNonExpired = true;  
        boolean credentialsNonExpired = true;  
        boolean accountNonLocked = true;
        String password = "";
        
        return new User(username, password, enables, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuths);  
	}
	
	//取得用户的权限  
    private Set<GrantedAuthority> obtionGrantedAuthorities(SysUser user) {  
        Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>(); 
        List<SysRole> roles = roleService.findRolesByUser(user);
          
        for(SysRole role : roles) {
        	authSet.add(new SimpleGrantedAuthority(role.getName()));  
        }
        
        return authSet;  
    }

}

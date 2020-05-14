package io.firstapp.springbootstarter.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import io.firstapp.springbootstarter.entity.User;
import io.firstapp.springbootstarter.repository.UserRepository;

@Service
public class MyUSerDetailsService implements UserDetailsService{

	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findByUserName(userName);
		
		user.orElseThrow(() -> new UsernameNotFoundException("Not Found" + userName));
		
		return user.map(MyUserDeatils::new).get();
		
	}

}

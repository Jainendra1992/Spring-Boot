package JwtExample3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

	@Bean
	public UserDetailsService userDetailsService()
	{
		UserDetails user = User.builder().username("jainendra").password(passwordEncoder().encode("jai125")).roles("ADMIN").build();
		UserDetails user1 = User.builder().username("sandeep").password(passwordEncoder().encode("jai125")).roles("ADMIN").build();
		UserDetails user2 = User.builder().username("shailendra").password(passwordEncoder().encode("jai125")).roles("ADMIN").build();
		UserDetails user3 = User.builder().username("mandeep").password(passwordEncoder().encode("jai125")).roles("ADMIN").build();
		
		return new  InMemoryUserDetailsManager(user,user1,user2,user3);
	}
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	
	
}

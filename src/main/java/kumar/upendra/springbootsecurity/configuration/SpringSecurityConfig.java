package kumar.upendra.springbootsecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void  configure(AuthenticationManagerBuilder auth)throws Exception{
		auth.inMemoryAuthentication().withUser("upendra").password("upendra").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("upendrak").password("upendrak").roles("USER");
		
	}
	
	/*//Security for all api
	@Override
	protected void  configure(HttpSecurity http)throws Exception{
		http.csrf().disable();
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
		
	}*/
	
	//Security based on URl
	/*@Override
	protected void  configure(HttpSecurity http)throws Exception{
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/rest/**").fullyAuthenticated().and().httpBasic();
		
	}*/
	
	
	//security based on role
	@Override
	protected void  configure(HttpSecurity http)throws Exception{
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("ADMIN").anyRequest().fullyAuthenticated().and().httpBasic();
		
	}
	
	
	
	@Bean
	public static NoOpPasswordEncoder password() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
	
	

}


package casestudy.Adminservice.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import casestudy.Adminservice.Services.AdminService;
import casestudy.Adminservice.Services.JwtFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private JwtFilter jwtFilterRequest;
	@Override 
	protected void configure(AuthenticationManagerBuilder auth)throws Exception{
	auth.userDetailsService(adminService);	
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().
		cors().disable().
		authorizeRequests().
		antMatchers("/swagger-resources/**", "/swagger-ui.html", "/v2/api-docs", "/swagger-ui/**",
				"/webjars/**","/reg","/auth")
	    .permitAll()
	    .anyRequest()
	    .authenticated()
	    .and().sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	    
	     http.addFilterBefore(jwtFilterRequest,UsernamePasswordAuthenticationFilter.class);
}
	 @Bean
	    public PasswordEncoder passwordEncoder() {
	        return NoOpPasswordEncoder.getInstance();
	    }
	
	
	
@Override
@Bean
public AuthenticationManager authenticationManagerBean() throws Exception{
		return super.authenticationManagerBean();
	}
	
	}
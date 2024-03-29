package poc.example.wishlist_module.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private CustomAuthenticationEntryPoint customAuthenticationEntryPoint;
	
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http                                                                             
                .authorizeHttpRequests()
                .antMatchers(HttpMethod.POST, "/api/wishlist").hasAnyAuthority("Admin")
                .antMatchers(HttpMethod.DELETE, "/api/wishlist/**").hasAuthority("Admin")
                .antMatchers(HttpMethod.GET,"/api/wishlist/product/**").hasAuthority("Admin")
                .anyRequest()
                .authenticated()
                .and().exceptionHandling(exception -> 
                exception.authenticationEntryPoint(customAuthenticationEntryPoint))
                
                .oauth2ResourceServer()
                .jwt();
        return http.build();
        
    }
}
    

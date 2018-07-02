package pl.mojaaplikacja.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/").permitAll()
                	.anyRequest().authenticated()
            .and()
            
            .formLogin()
            	.loginPage("/loginForm")
            		.permitAll()
            		
            .loginProcessingUrl("/processingLogin")
            	.permitAll()
            	
        	.usernameParameter("username")
            .passwordParameter("password")	
            
            .and()
            
            .logout()
            	.logoutUrl("/logmeout")
            		.logoutSuccessUrl("/")
            			.permitAll();
        	
    }
    
}

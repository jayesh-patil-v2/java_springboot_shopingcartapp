package poc.example.wishlist_module.config;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import poc.example.wishlist_module.entity.RestError;

@Component
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

	 @Override
	 public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
		 if(authException instanceof OAuth2AuthenticationException && "invalid_token".equals(authException.getMessage())) {
			 
		 RestError re = new RestError("" + HttpStatus.SC_UNAUTHORIZED, "Expired or invalid token");

	        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
	        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	        OutputStream responseStream = response.getOutputStream();
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.writeValue(responseStream, re);
	        responseStream.flush();
	    }
	 }
	}



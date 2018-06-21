/**
 * 
 */
package com.studiohub.user.application.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * @author MXA86SG
 *
 */

@Component
public class AuthenticationSucessHandler extends SimpleUrlAuthenticationSuccessHandler {

	private RedirectStrategy redirect = new DefaultRedirectStrategy();

	@Override
	protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		redirect.sendRedirect(request, response, "/user/home");
	}
	
	
	
}

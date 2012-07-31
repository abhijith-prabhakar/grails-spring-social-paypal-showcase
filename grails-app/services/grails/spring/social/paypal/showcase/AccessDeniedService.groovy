package grails.spring.social.paypal.showcase

import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

import org.springframework.security.access.AccessDeniedException
import org.springframework.security.web.access.AccessDeniedHandlerImpl


class AccessDeniedService extends AccessDeniedHandlerImpl {

	@Override
	public void handle(HttpServletRequest request,
	HttpServletResponse response, AccessDeniedException exception)
	throws IOException, ServletException {
		log.info("############### Access Denied Handler!")
		setErrorPage("/accessDenied")
		super.handle(request, response, exception)
	}
}

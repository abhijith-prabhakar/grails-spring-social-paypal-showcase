import grails.spring.social.paypal.showcase.AccessDeniedService


// Place your Spring DSL code here
beans = {
	//userDetailsService(grails.spring.social.paypal.showcase.BMLUserDetailsService)
	accessDeniedHandler(grails.spring.social.paypal.showcase.AccessDeniedService)
}

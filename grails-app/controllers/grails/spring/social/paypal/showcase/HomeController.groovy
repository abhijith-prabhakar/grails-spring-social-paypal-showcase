package grails.spring.social.paypal.showcase


import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils

import web.application.common.security.BMLUser
import grails.plugins.springsecurity.Secured



@Secured([
	"hasRole('ROLE_USER') and isFullyAuthenticated()"
])
class HomeController {

	def springSecurityService

	def index() {
		def user = ((BMLUser)springSecurityService.principal).getPayPalUser()
		render(view:"home",model:[profile:user])
	}

	def signout(){
		redirect uri: SpringSecurityUtils.securityConfig.logout.filterProcessesUrl
	}
}

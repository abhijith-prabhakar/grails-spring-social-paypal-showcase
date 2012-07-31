package grails.spring.social.paypal.showcase

import org.codehaus.groovy.grails.plugins.springsecurity.GrailsUserDetailsService
import org.springframework.dao.DataAccessException
import org.springframework.security.core.authority.GrantedAuthorityImpl
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.social.openidconnect.api.PayPal
import org.springframework.social.openidconnect.api.PayPalProfile

import web.application.common.security.BMLUser;

class BMLUserDetailsService implements GrailsUserDetailsService {

	PayPal payPal

	static final List ROLES = [
		new GrantedAuthorityImpl('ROLE_USER')
	]

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		PayPalProfile userProfile = payPal.getUserProfile()
		return  new BMLUser(userProfile, ROLES)
	}

	@Override
	public UserDetails loadUserByUsername(String username, boolean loadRoles) throws UsernameNotFoundException, DataAccessException {
		return loadUserByUsername(username)
	}
}

grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.plugin.location."spring-social-paypal"="/Users/abprabhakar/paypal_financing_workspace/web-application-common-paypal-access"
grails.project.dependency.resolution = {
	// inherit Grails' default dependencies
	inherits("global") {
		// specify dependency exclusions here; for example, uncomment this to disable ehcache:
		// excludes 'ehcache'
	}
	log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	checksums true // Whether to verify checksums on resolve

	repositories {
		inherits false // Whether to inherit repository definitions from plugins
		mavenLocal()
		mavenCentral()
		mavenRepo "http://maven01.billmelater.com:8080/nexus/content/groups/public-all/"
		mavenRepo "http://maven01.billmelater.com:8080/nexus/content/groups/public/"
	}
	dependencies {
		// specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
		def springSocialVersion = "1.0.2.RELEASE"
		// runtime 'mysql:mysql-connector-java:5.1.20'

		runtime 'javax.servlet.jsp.jstl:jstl-api:1.2'
		runtime 'org.glassfish.web:jstl-impl:1.2'


		compile("org.springframework.social:spring-social-core:${springSocialVersion}") { transitive = false }
		compile("org.springframework.social:spring-social-web:${springSocialVersion}") { transitive = false }

		compile("org.springframework.security:spring-security-crypto:3.1.0.RELEASE") { transitive = false }
	}

	plugins {
		runtime ":hibernate:$grailsVersion"
		runtime ":jquery:1.7.2"
		runtime ":resources:1.1.6"

		compile(":spring-security-core:1.2.7.3")
		compile(":spring-social-core:0.1.31")
	}
}

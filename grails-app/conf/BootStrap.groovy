import org.grails.twitter.auth.*

class BootStrap {
	def springSecurityService

    def init = { servletContext ->
         def userRole = new Authority(authority: 'ROLE_ADMIN').save()

         def password = springSecurityService.encodePassword('password')

         def admin = new Person(username: 'admin', realName: 'admin', 
                              password: password, 
                              enabled: true, email: 'admin@home.com')
         admin.addToAuthorities(userRole)
         admin.save()
    }
    def destroy = {
    }
}

package org.grails.twitter

import org.grails.twitter.auth.Person 

class StatusController {

	def springSecurityService
	
    def index = { }
    
    def updateStatus = {
		def status = new Status(message: params.message)
		status.author = lookupPerson()
		status.save()
		def messages = currentUserTimeLine()
		render template: 'messages' , collection: messages, var = 'message'
		}
		
	def getRandom = { 
		render "What happened"
	}
	private lookupPerson(){
		Person.get(springSecurity.principal.id)
		}
}

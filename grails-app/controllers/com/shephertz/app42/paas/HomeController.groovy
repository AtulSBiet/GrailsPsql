package com.shephertz.app42.paas

class HomeController {

    def index() { 
    }
    
    def save(){
        println params
        def userInstance = new App42User(params)
        if(userInstance.save(flush: true)){
            redirect(action: "show")
        }else{
            flash.message = "Data not saved"
            redirect(action: "index")
        }
        
    }
    
    def show = {
        
        def userInstance = App42User.findAll()
        [userInstance: userInstance]
    }
}

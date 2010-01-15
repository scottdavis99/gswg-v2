class AdminFilters { 
  def filters = { 
    adminOnly(controller:'*',  
             action:"(create|edit|update|delete|save)") { 
      before = {       
        if(!session?.user?.admin){ 
          flash.message = "Sorry, admin only" 
          redirect(controller:"race", action:"list") 
          return false 
        } 
      } 
    } 
  } 
}
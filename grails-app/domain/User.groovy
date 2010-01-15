class User { 
  String login 
  String password 
  String role = "user" 
 
  static constraints = { 
    login(blank:false, nullable:false, unique:true) 
    password(blank:false, password:true) 
    role(inList:["admin", "user"]) 
  } 
     
  String toString(){ 
    login 
  } 
}
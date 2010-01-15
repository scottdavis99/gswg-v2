class UnderscoreCodec { 
  static encode = {target-> 
    target.replaceAll(" ", "_") 
  } 
   
  static decode = {target-> 
    target.replaceAll("_", " ") 
  } 
} 

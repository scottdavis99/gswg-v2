class Race {
  String name
  Date startDate
  String city
  String state
  BigDecimal distance
  BigDecimal cost
  Integer maxRunners = 100000

  static hasMany = [registrations:Registration]
  
  static searchable = true
  
  static constraints = {
    name(blank:false, maxSize:50)
    startDate(validator: {return (it > new Date())})
    city()
    state(inList:["GA", "NC", "SC", "VA"])
    distance(min:0.0)
    cost(min:0.0, max:100.0)
    maxRunners(min:0, max:100000)
  }
  
  BigDecimal inMiles(){
    return distance * 0.6214
  }
  
  String toString(){
    return "${name}, ${startDate.format('MM/dd/yyyy')}"
  }
}

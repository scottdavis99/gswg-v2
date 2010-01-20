<div id="search"> 
  <g:form url='[controller: "race", action: "search"]' 
          id="raceSearchForm" 
          name="raceSearchForm" 
          method="get"> 
    <g:textField name="q" value="${params.q}" /> 
    <input type="submit" value="Find a race" /> 
  </g:form> 
</div>
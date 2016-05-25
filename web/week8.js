


function init()
{
    var xmlRequest = new XMLHttpRequest();
    xmlRequest.open("GET", "AjaxServlet" ,true);
    xmlRequest.onreadystatechange = breadListReadyStateHandler;
    xmlRequest.send();
    
}

function breadListReadyStateHandler()
{
  var descriptionDiv =document.getElementById("bread_select");
  descriptionDiv.innerHTML = this.response;
}



function makeXHR(n)
{
	var xmlHttp = null;
	xmlHttp = new XMLHttpRequest();
	
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
				console.log(xmlHttp.responseText);
				document.getElementById("responseBox").innerHTML=document.getElementById("responseBox").innerHTML+"<br>"+xmlHttp.responseText
		}
	}
	while(n>0)
    {
		xmlHttp.open( "GET", "/requestListner001.do?param1="+(new Date()).getMilliseconds(), false );
		xmlHttp.send(null);
		n=n-1;
    }	
	
}
package com.action;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.*;

@Controller
public class ServletAction {
	
	@RequestMapping("/requestListner001.do")
	@ResponseBody
	public String requestListner(HttpServletRequest req)
	{
		System.out.println("Reaching action controller");
		String param1=req.getParameter("param1");
//		System.out.println("Reaching action controller");
//		return "Response from Client"+param1;
		System.out.println("Response from Client Id: "+param1);
		return "Response from Client Id :"+param1;
	}
	
	@RequestMapping("/redirector.do")
	public String redirectpage(HttpServletRequest req)
	{		System.out.println("redirecting...");
		return "requestMonitor";
	}
}

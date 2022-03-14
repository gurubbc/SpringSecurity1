package com.ofss;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityController {

	
	
	@RequestMapping(value="logoutSuccessful", method=RequestMethod.GET)
	public String logoutSuccessful()
	{
		return "logoutSuccessful"; // logoutSuccessful.jsp
	}
	@RequestMapping(value="wrongUser", method=RequestMethod.GET)
	public String wrongUserPage()
	{
		return "wrongUser"; // wrongUser.jsp
	}
	
	@RequestMapping(value="public", method=RequestMethod.GET)
	public String publicPage()
	{
		return "public"; // we should have public.jsp (not secured)
	}
	
	@RequestMapping(value="private", method=RequestMethod.GET)
	public String privatePage(Principal principal, ModelMap map)
	{
		String userLoggedIn=principal.getName();
		String msg="Hello "+userLoggedIn;
		map.addAttribute("msg",msg);
		return "private"; // we should have private.jsp (secured)
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home()
	{
		return "home"; // home.jsp
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage()
	{
		return "login"; // login.jsp
	}
}

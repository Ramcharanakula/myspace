package app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Control {
	@Autowired
	Customer c;
	

	@RequestMapping("/customer")
	public ModelAndView detail(HttpServletRequest request,HttpServletResponse response) {
		String name= request.getParameter("name");
		String password= request.getParameter("password");
		String email= request.getParameter("email");
		String contact= request.getParameter("contact");
		c.setCname(name);
		c.setPassword(password);
		c.setEmail(email);
		c.setContact(contact);
		System.out.println(c);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Details");
		mv.addObject("Details", c);
		return mv;
		
		
	}

}

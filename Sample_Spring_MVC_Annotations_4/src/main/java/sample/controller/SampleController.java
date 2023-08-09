package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sample.beans.UserDetails;

@Controller
public class SampleController {
	
	@RequestMapping(value="/profile",method = RequestMethod.POST)
	public ModelAndView getProfile(@RequestParam("username") String user, @RequestParam("password") String pass, @RequestParam("gen") String gen) {
		UserDetails ud=new UserDetails();
		ud.setUser(user);
		ud.setPassword(pass);
		ud.setGender(gen);
		ModelAndView mav=new ModelAndView("profile","data",ud);
		return mav;
	}

}

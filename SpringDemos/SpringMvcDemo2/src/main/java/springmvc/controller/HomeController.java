package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home") // this means that home() will run when we'll fire /home 
	// This will a string which is the name of View page 
	public String home(Model mod) {
		System.out.println("From Home URL");
		mod.addAttribute("name","Ekta");
		List<String> lst=new ArrayList<String>();
		lst.add("Adwait");
		lst.add("Shimon");
		mod.addAttribute("l", lst);
		
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("From about URL");
		return "about";
	}	
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is help Controller");
		//Creating ModelAndView
		ModelAndView mav=new ModelAndView();
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(1234);
		marks.add(2345);
		marks.add(4567);
		mav.addObject("m", marks);
		//Setting the data
		mav.addObject("name", "Krish");
		
		//Setting the View
		mav.setViewName("help");
		return mav;
	}

}

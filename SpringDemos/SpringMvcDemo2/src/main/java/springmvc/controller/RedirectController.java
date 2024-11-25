package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@RequestMapping("/one")
	//for redirect prefix
	 /* public String one() { System.out.println("This is handler - 1"); return
	 * "redirect:/enjoy"; }
	 */
	
	//for RedirectView
	public RedirectView one()
	{
		System.out.println("This is handler - 1");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	
	@RequestMapping("/enjoy")
	public String two()
	{
		System.out.println("This is handler - 2");
		return "contacts";
	}

}

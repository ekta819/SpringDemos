package com.learn.spring.mvc_example1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
   /* @RequestMapping("/")
    public String home(){
        return "index";
    }*/
    @RequestMapping("/")
    public String home(){
        return "index1";
    }

    @RequestMapping("add")
    //public String add(HttpServletRequest req, HttpSession session){

    // To remove HTTP session
   // public String add(@RequestParam("num1") int num, int num2, Model model){
   // public String add(@RequestParam("num1") int num,int num2, HttpSession session){
    public ModelAndView add(int num1, int num2, ModelAndView mv){
        int r=num1+num2;
        //session.setAttribute("result",r);
       // model.addAttribute("result", r);
        mv.addObject("result", r);
        mv.setViewName("result");

        return mv;

    }

    @RequestMapping("addPpl")
   // public ModelAndView addPpl(int aid, String aname, ModelAndView mv){
  //  public String addPpl(@ModelAttribute /*this attribute is optional*/ People people){
    public String addPpl( People people){
      /*  People pl=new People();
        pl.setAid(aid);
        pl.setAname(aname)

        mv.addObject("resultPpl", pl);
        mv.setViewName("result");

        return mv; */

        return "result";

    }

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    }

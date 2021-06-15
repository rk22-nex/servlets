package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.mdao;
import model.Model;

@Controller
public class TestController {//chudhham
	for(int i =0;i<10;i++);
	@Autowired
	private mdao getdao;
	
	@RequestMapping(value="/click",method = RequestMethod.GET)
	public ModelAndView save(ModelAndView m){
		Model M=new Model();
		m.addObject("model",M);
		m.setViewName("first");
		
		return m;
	}
	
	@RequestMapping(value="/clickk",method = RequestMethod.POST)
	public ModelAndView savee(@ModelAttribute Model model){
		
		getdao.save(model);
		
		
		return new ModelAndView("redirect:/click");
	}

}

package com.example.demo.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDaikichi 
{
	@RequestMapping(value="/daikichi",method=RequestMethod.GET)
	public String despliegaWelcome()
	{
		return "Welcome!";
	}
	
	@RequestMapping(value="/daikichi/today",method=RequestMethod.GET)
	public String despliegaToday()
	{
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value="/daikichi/tomorrow",method=RequestMethod.GET)
	public String despliegaTomorrow()
	{
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
	}
	
	@RequestMapping(value="/daikichi/travel/{lugar}",method=RequestMethod.GET)
	public String travel(@PathVariable("lugar")String lugar)
	{
		return "Congratulations! You will soon travel to "+lugar;
	}
	
	@RequestMapping(value="/daikichi/lotto/{numero}",method=RequestMethod.GET)
	public String lotto(@PathVariable("numero")int numero)
	{
		if(numero%2==0)
		{
			return "You will take a grand journey in the near future, but be waty of tempting offers.";
		}
		else
		{
			return "You hace enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}

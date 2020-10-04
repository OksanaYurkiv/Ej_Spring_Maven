package com.oksana.controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioControlador {
     public InicioControlador( ) {
    	 
    	 
     }
     @RequestMapping(path = "/bienvenida")
     public ModelAndView  bienvenida (HttpServletRequest request, HttpServletResponse response) {
    	 
    	 ModelAndView mv;
    	 String saludo;
    	 String nivel;
    	 
    	 
    	 saludo= "Bienvenido al curso de Spring";
    	 nivel = "avanzado";
    	 
    	 
    	 
    	 
    	 mv = new ModelAndView();
    	 mv.setViewName("InicioVista");
    	 mv.addObject("saludo", saludo);
    	 mv.addObject("nivel", nivel);
    	 
    	 
    	 
    	 return mv;
     }
}

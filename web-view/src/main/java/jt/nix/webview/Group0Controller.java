package jt.nix.webview;


import jt.nix.model.entity.Group0;
import jt.nix.service.Group0Service;
import org.springframework.web.servlet.*;
import org.springframework.web.servlet.mvc.multiaction.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public class Group0Controller extends MultiActionController{

    private Group0Service group0Service;


    public ModelAndView list(HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView0 = new ModelAndView("group0/list");
        modelAndView0.addObject("group0List", group0Service.getAll());
        return  modelAndView0 ;
    }

}

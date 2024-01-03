package pro.samgerstner.productlicenseportal.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
   @Value("${application.title}")
   private String title;

   @GetMapping(value = {"/", "/home"})
   public String home(Model model)
   {
      model.addAttribute("appTitle", title);
      return "index";
   }
}
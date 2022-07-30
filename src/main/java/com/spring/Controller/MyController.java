package com.spring.Controller;

import com.spring.Service.LoginService;
import com.spring.model.Customer;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"UserId", "Username", "Success"})
public class MyController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/loginPage")
    public String ShowLogin(Model model) {

//        Users users
        System.out.println("Hello");
        return "login";
    }

    @RequestMapping("/home")
    public String Showhome() {

        return "Home";
    }

    @RequestMapping(path = "/Login", method = RequestMethod.POST)
    public String Login(@ModelAttribute("cust") Customer cust, Model m, HttpSession session) {

        System.out.println("Username is: " + cust.getUsername() + " Password is: " + cust.getPassword());

        Customer result = this.loginService.CkeckLogin(cust.getUsername(), cust.getPassword());
        System.out.println("result in mycontroller : " + result);
        if (cust.getUsername().isEmpty() && cust.getPassword().isEmpty()) {
            m.addAttribute("Message", "Please give your Username and password...");
            return "login";
        } else if (result != null) {
            System.out.println(result);
            System.out.println("Customer Id is : " + result.getCutsomerId());
//
//            for (Customer customer : result) {
//                int userId = customer.getCutsomerId();
//                System.out.println("id is  in result section: " + userId);
//                m.addAttribute("Success", "Login Successfully...");
//                m.addAttribute("Username", result.getUsername());
//                m.addAttribute("UserId", result.getCutsomerId());
//            }

            session.setAttribute("UserId", result.getCutsomerId());
            session.setAttribute("UserName", result.getUsername());

            int UserId = (int) session.getAttribute("UserId");
            String Username = (String) session.getAttribute("UserName");
            System.out.println("UserId Is : " + UserId);
            System.out.println("UserId Is : " + Username);

            return "redirect:/home";
        } else {
            m.addAttribute("Message", "Login failed due to wrong Username OR Password...");
            return "login";
        }
    }

    @RequestMapping(path = "/logout", method = RequestMethod.POST)
    public String OnLogout(SessionStatus status) {

        status.setComplete();

        System.out.println("Logout successfully...");
        return "login";
    }
}

package com.spring.Controller;

import com.spring.Service.GasBookingService;
import com.spring.model.Gas;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class GasController {

    @Autowired
    private GasBookingService gasBookingService;

    @RequestMapping("/gasbooking")
    public String ShowGasBooking() {

        return "BookYourGas";
    }

    @RequestMapping(path = "/GasBooking", method = RequestMethod.POST)
    public String ONSubmitGasForm(@ModelAttribute("gas") Gas gas) {
        System.out.println(gas);
        Integer insert = this.gasBookingService.insert(gas);
        if (insert != null) {
            System.out.println("data has inserted successfully !!!");
            return "redirect:/index";
        }
        return "BookYourGas";
    }

    @RequestMapping(path = "/updateGasBooking", method = RequestMethod.POST)
    public String ONSubmitUpdateGasForm(@ModelAttribute("gas") Gas gas) {
        System.out.println(gas);
        this.gasBookingService.UpdateBooking(gas);

        System.out.println("data has updated successfully !!!");
        return "redirect:/index";

    }

    @RequestMapping("/index")
    public String ShowIndexPage(Model m, HttpSession session) {
        int UserId = (int) session.getAttribute("UserId");
        String Username = (String) session.getAttribute("UserName");
        System.out.println("UserId Is : " + UserId);
        System.out.println("UserId Is : " + Username);
        List<Gas> gas = this.gasBookingService.ShowAllBooking(UserId);
        System.out.println("Data : " + gas);
//        for (Gas ga : gas) {
//            System.out.println(ga.getBookingId());
//            System.out.println(ga.getAddress1());
//            System.out.println(ga.getAddress2());
//            System.out.println(ga.getCity());
//            System.out.println(ga.getBookingDate());
//            System.out.println(ga.getCosumerName());
//            System.out.println(ga.getCylinderType());
//            System.out.println(ga.getDistributorName());
//            System.out.println(ga.getEmail());
//            System.out.println(ga.getMobileNumber());
//        }

        m.addAttribute("Data", gas);
        return "index";
    }

    @RequestMapping("delete/{BookingId}")
    public RedirectView DeleteBooking(@PathVariable("BookingId") Integer BookingId, HttpServletRequest request) {

        RedirectView redirectView = new RedirectView();
        this.gasBookingService.DeleteBooking(BookingId);
        redirectView.setUrl(request.getContextPath() + "/index");
        return redirectView;
    }

    @RequestMapping("update/{BookingId}")
    public String UpdateBooking(@PathVariable("BookingId") Integer BookingId, HttpServletRequest request, Model model) {

        Gas result = this.gasBookingService.showBooking(BookingId);
        System.out.println("Record in Update method is  : " + result);
        model.addAttribute("PreBookData", result);
        return "UpdateForm";
    }
}

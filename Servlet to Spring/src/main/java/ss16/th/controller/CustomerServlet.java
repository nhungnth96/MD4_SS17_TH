package ss16.th.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ss16.th.model.Customer;
import ss16.th.service.IGenericService;

import java.util.List;
import javax.servlet.http.*;

@Controller
public class CustomerServlet {
    @Autowired
    private IGenericService IGenericService;
    @GetMapping("/customers")
    public String showList (Model model){
        List<Customer> customers = IGenericService.findAll();
        model.addAttribute("customers",customers);
        return "customers/list";
    }
    @GetMapping("detail/{id}")
    public String detail (@PathVariable Long id, HttpServletRequest request){
        Customer customer = IGenericService.findOne(id);
        request.setAttribute("customer", customer);
        return "customers/info";
    }
}
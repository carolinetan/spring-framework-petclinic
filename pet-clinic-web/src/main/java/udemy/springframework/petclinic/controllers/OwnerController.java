package udemy.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import udemy.springframework.petclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    //@Autowired --> Optional
    //               In Spring 5, spring automatically does the autowiring
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/","/index", "/index.html"})
    public String listOfOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

}

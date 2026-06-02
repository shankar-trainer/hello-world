package com.cts.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.SmartValidator;
import org.springframework.web.bind.annotation.*;
import com.cts.model.Insurance;
import com.cts.service.InsuranceService;
import com.cts.validation.ValidationGroups;

@Controller
@RequestMapping("/insurance")
public class InsuranceController {

    @Autowired
    private InsuranceService service;

    @Autowired
    private SmartValidator validator; // Programmatic validator

    @GetMapping("/form")
    public String hello(ModelMap map) {
        map.addAttribute("insurance", new Insurance());
        return "insuranceform";
    }

    @PostMapping("/addRecord")
    public String addRecord(@ModelAttribute Insurance insurance, BindingResult result,
                            @RequestParam("submit") String submit, ModelMap map) {
        
        System.out.println("submit is " + submit);
        
        // 1. Manually trigger validation groups based on the submitted action
        switch (submit.toLowerCase()) {
            case "add record":
                validator.validate(insurance, result, ValidationGroups.Add.class);
                break;
                
            case "update record":
                validator.validate(insurance, result, ValidationGroups.Update.class);
                break;
                
            case "search by id":
            case "delete by id":
                validator.validate(insurance, result, ValidationGroups.IdOnly.class);
                break;
                
            case "show all":
                // No validation required at all for showing all records
                break;
                
            default:
                break;
        }

        // 2. Check for errors AFTER conditional validation
        if (result.hasErrors()) {
            return "insuranceform";
        }

        // 3. Process valid business logic
        switch (submit.toLowerCase()) {
            case "add record":
                service.addInsurance(insurance);
                break;

            case "show all":
                List<Insurance> allInsurance = service.getAllInsurance();
                map.addAttribute("allInsurance", allInsurance);
                break;

            case "search by id":
                Insurance insurance1 = service.searchById(insurance.getId());
                map.addAttribute("insurance1", insurance1);
                break;

            case "delete by id":
                var ins = service.deleteById(insurance.getId());
                map.addAttribute("ins", ins);
                break;
                
            case "update record":
                var ins3 = service.updateRecord(insurance);
                map.addAttribute("ins3", ins3);
                break;
        }

        map.addAttribute("msg", submit);
        return "insuranceresult";
    }
}
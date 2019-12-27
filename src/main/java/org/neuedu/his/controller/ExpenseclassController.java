package org.neuedu.his.controller;

import org.neuedu.his.model.Expenseclass;
import org.neuedu.his.model.RespBean;
import org.neuedu.his.service.ExpenseclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenseclass")
public class ExpenseclassController {
    @Autowired
    ExpenseclassService expenseclassService;
    @GetMapping("/searchexpenseclass")
    public List<Expenseclass> searchexpenseclass(){
        return expenseclassService.searchexpenseclass();
    }
}

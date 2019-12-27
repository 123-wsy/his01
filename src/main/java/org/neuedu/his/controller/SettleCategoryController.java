package org.neuedu.his.controller;

import org.neuedu.his.model.SettleCategory;
import org.neuedu.his.service.SettleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/SettleCategory")
public class SettleCategoryController {
    @Autowired
    SettleCategoryService settleCategoryService;
    @GetMapping("/getSettle")
    public List<SettleCategory> getSettle(){
        return settleCategoryService.getSettle();
    }
}

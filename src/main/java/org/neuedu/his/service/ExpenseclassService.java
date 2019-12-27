package org.neuedu.his.service;

import org.neuedu.his.mapper.ExpenseclassMapper;
import org.neuedu.his.model.Expenseclass;
import org.neuedu.his.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseclassService {
@Autowired
    ExpenseclassMapper expenseclassMapper;
    public List<Expenseclass> searchexpenseclass() {
       return expenseclassMapper.searchexpenseclass();
    }


}

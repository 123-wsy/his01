package org.neuedu.his.service;

import org.neuedu.his.mapper.ConstanttypeMapper;
import org.neuedu.his.model.Constanttype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtypeService {
    @Autowired
    ConstanttypeMapper constanttypeMapper;
    public List<Constanttype> getCtypeByCodeOrName(String constanttypecode, String constanttypename) {
        return constanttypeMapper.getCtypeByCodeOrName(constanttypecode,constanttypename);
    }
}

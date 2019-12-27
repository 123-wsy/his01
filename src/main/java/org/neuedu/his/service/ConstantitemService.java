package org.neuedu.his.service;

import org.neuedu.his.mapper.ConstantitemMapper;
import org.neuedu.his.model.Constantitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstantitemService {
    @Autowired
    ConstantitemMapper constantitemMapper;
    public List<Constantitem> getConstantitem(Integer constanttypeid){
        return constantitemMapper.getConstantitem(constanttypeid);
    }
}

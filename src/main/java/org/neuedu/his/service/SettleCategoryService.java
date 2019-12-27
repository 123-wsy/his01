package org.neuedu.his.service;

import org.neuedu.his.mapper.SettleCategoryMapper;
import org.neuedu.his.model.SettleCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettleCategoryService {
    @Autowired
    SettleCategoryMapper settleCategoryMapper;

    public List<SettleCategory> getSettle() {
        return settleCategoryMapper.getSettle();
    }
}

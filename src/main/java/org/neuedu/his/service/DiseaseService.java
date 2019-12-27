package org.neuedu.his.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.his.mapper.DiseaseMapper;
import org.neuedu.his.model.DiseCategory;
import org.neuedu.his.model.Disease;
import org.neuedu.his.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiseaseService {
    @Autowired
    DiseaseMapper diseaseMapper;
    public PageInfo getDisease(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<Disease> list =diseaseMapper.getDisease(keyword);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    public RespBean insertSelective(Disease disease) {
        int i = diseaseMapper.insertSelective(disease);
        if(i == 0){
            return RespBean.error("新增疾病失败");
        }else{
            return RespBean.ok("新增疾病成功");
        }
    }
}

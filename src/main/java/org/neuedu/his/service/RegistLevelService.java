package org.neuedu.his.service;

import org.neuedu.his.mapper.RegistLevelMapper;
import org.neuedu.his.model.RegistLevel;
import org.neuedu.his.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistLevelService {
    @Autowired
    RegistLevelMapper registLevelMapper;
    public List<RegistLevel> getAllRegistLevel(Integer deptid,String scheddate,String noon) {
        return registLevelMapper.getAllRegistLevel(deptid,scheddate,noon);
    }

    public RegistLevel getRegistQuota(String id) {
        return registLevelMapper.getRegistQuota(id);
    }

    public List<RegistLevel> getRegistLevel() {
        return registLevelMapper.getRegistLevel();
    }

    public List<RegistLevel> allRegistLevels() {
        return registLevelMapper.allRegistLevels();
    }

    public List<RegistLevel> searchRegByKeyWords(String keywords) {
        return registLevelMapper.searchRegByKeyWords(keywords);
    }

    public RespBean saveRegistLevel(RegistLevel registlevel) {
        Integer i=registLevelMapper.insertSelective(registlevel);
        if (i !=0){
            return RespBean.ok("新增挂号级别成功");
        }else{
            return RespBean.error("新增挂号级别失败");
        }
    }

    public RespBean updateRegistLevel(RegistLevel registlevel) {
        Integer i=registLevelMapper.updateByPrimaryKeySelective(registlevel);
        if (i !=0){
            return RespBean.ok("修改挂号级别成功");
        }else{
            return RespBean.error("修改挂号级别失败");
        }
    }

    public RespBean delRegistLevel(Integer id) {
        Integer i=registLevelMapper.delRegistLevel(id);
        if (i !=0){
            return RespBean.ok("删除挂号级别成功");
        }else{
            return RespBean.error("修改挂号级别失败");
        }
    }
}

package org.neuedu.his.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.his.mapper.DiseCategoryMapper;
import org.neuedu.his.model.DiseCategory;
import org.neuedu.his.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiseCategoryService {
    @Autowired
    DiseCategoryMapper diseCategoryMapper;
    public PageInfo getDiseCategory(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        List<DiseCategory> list =diseCategoryMapper.getDiseCategory(keyword);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    public DiseCategory getLastId() {
        return diseCategoryMapper.getLastId();
    }

    public RespBean insertSelective(DiseCategory diseCategory) {
        int i = diseCategoryMapper.insertSelective(diseCategory);
        if(i == 0){
            return RespBean.error("添加疾病分类失败");
        }else{
            return RespBean.ok("添加疾病分类成功");
        }
    }

    public List<DiseCategory> getDiseCategorys() {
        return diseCategoryMapper.getDiseCategorys();
    }

    public RespBean deleteByPrimaryKey(Integer id) {
        int i = diseCategoryMapper.deleteByPrimaryKey(id);
        if(i == 0){
            return RespBean.error("删除疾病分类失败");
        }else{
            return RespBean.ok("删除疾病分类成功");
        }
    }

    public RespBean deleteByPrimaryKeyS(Integer[] ids) {
        Integer i = diseCategoryMapper.deleteByPrimaryKeyS(ids);
        if(i == 0){
            return RespBean.error("批量删除疾病分类失败");
        }else{
            return RespBean.ok("批量删除疾病分类成功");
        }
    }
}

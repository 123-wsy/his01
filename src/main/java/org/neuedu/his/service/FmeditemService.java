package org.neuedu.his.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.neuedu.his.mapper.FmeditemMapper;
import org.neuedu.his.model.Fmeditem;
import org.neuedu.his.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FmeditemService {
    @Autowired
    FmeditemMapper fmeditemMapper;
    public PageInfo searchAllFmeditem(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
         List<Fmeditem> list=fmeditemMapper.searchAllFmeditem(keyword);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
    public RespBean addexpenseclass(Fmeditem fmeditem) {
        Integer i=fmeditemMapper.insertSelective(fmeditem);
        if (i !=0){
            return RespBean.ok("新增非药品收费项目成功");
        }else{
            return RespBean.error("新增非药品收费项目失败");
        }
    }

    public RespBean updfmeditem(Fmeditem fmeditem) {
        Integer i=fmeditemMapper.updateByPrimaryKeySelective(fmeditem);
        if (i !=0){
            return RespBean.ok("修改非药品收费项目成功");
        }else{
            return RespBean.error("修改非药品收费项目失败");
        }
    }

    public RespBean delfmeditem(Integer id) {
        Integer i=fmeditemMapper.delfmeditem(id);
        if (i !=0){
            return RespBean.ok("删除非药品收费项目成功");
        }else{
            return RespBean.error("删除非药品收费项目失败");
        }
    }

    public RespBean delManyfmeditem(Integer[] ids) {
        Integer i=fmeditemMapper.delManyfmeditem(ids);
        if (i !=0){
            return RespBean.ok("批量删除非药品收费项目成功");
        }else{
            return RespBean.error("批量删除非药品收费项目失败");
        }
    }
}

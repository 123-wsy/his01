package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.Constantitem;
import org.neuedu.his.model.Constanttype;

import java.util.List;

public interface CategoryMapper {
    //查询所以类别管理或模糊查询
    List<Constanttype> categoryAllInfo(String keywords);
    //添加类别管理
    int addCategory(Constanttype constanttype);
    //查询所属类别
    List<Constanttype> categoryName();
    //查询常数项
    List<Constantitem> getConstantitem(String keywords, String typeId);
    //新增常数项
    int addConstantitem(Constantitem constantitem);
    //删除常数项
    int delConstantitem(Integer id);
    //批量删除常数项
    int delMulConstantitemById(@Param("ids") Integer[] ids);
    //编辑常数项
    int updateConstantitem(Constantitem constantitem);
    //查询医生职称
    List<Constantitem> serchconstantname();
}

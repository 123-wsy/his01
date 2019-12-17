package org.neuedu.his.service;

import org.neuedu.his.mapper.DepartmentMapper;
import org.neuedu.his.model.Department;
import org.neuedu.his.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {
    @Autowired
    DepartmentMapper departmentMapper;
    public RespBean getDeptByCodeOrName(Department department) {
        Department department1 = departmentMapper.getDeptByCodeOrName(department);
        if(department1 == null){
            RespBean error = RespBean.error("没这科");
            return error;
        }else{
            RespBean ok = RespBean.ok("查询成功",department1);
            return ok;
        }
    }

    public RespBean delDeptByIds(Integer[] ids) {
        Integer i = departmentMapper.delDeptByIds(ids);
        if(i == null){
            RespBean error = RespBean.error("删除失败");
            return error;
        }else{
            RespBean ok = RespBean.ok("删除成功");
            return ok;
        }
    }
}

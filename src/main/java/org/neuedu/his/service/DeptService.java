package org.neuedu.his.service;

import org.neuedu.his.mapper.DepartmentMapper;
import org.neuedu.his.model.Department;
import org.neuedu.his.model.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    DepartmentMapper departmentMapper;
    public List<Department> getDeptByCodeOrName(String deptcode,String deptname) {
        List<Department> department1 = departmentMapper.getDeptByCodeOrName(deptcode,deptname);
        return department1;
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

    public List<Department> getAllDept() {
        return departmentMapper.getAllDept();
    }

    public List<Department> deptInfos() {
        return departmentMapper.deptInfos();

    }

    public List<Department> getDept(String deptname) {
        return departmentMapper.getDept(deptname);
    }

    public RespBean delDept(Integer id) {
        int i  = departmentMapper.delDept(id);
        if (i==0){
            return RespBean.error("删除失败");
        }else{
            return RespBean.ok("删除成功");
        }
    }
}

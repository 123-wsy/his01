package org.neuedu.his.mapper;

import org.apache.ibatis.annotations.Param;
import org.neuedu.his.model.Department;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> getDeptByCodeOrName(@Param("deptcode") String deptcode,@Param("deptname") String deptname);

    Integer delDeptByIds(@Param("ids") Integer[] ids);

    List<Department> getAllDept();

    List<Department> deptInfos();

    List<Department> getDept(String deptname);

    int delDept(Integer id);

}
package com.dingbs.shiromybatis.entity.department;

import com.dingbs.shiromybatis.entity.user.UserEntity;

import java.util.List;

/**
 * Created by Administrator on 2018\3\19 0019.
 */
public class DepartmentEntity {

    private Integer departmentId;

    private String departmentName;

    private List<UserEntity> userList;

    public List<UserEntity> getUserList() {
        return userList;
    }

    public void setUserList(List<UserEntity> userList) {
        this.userList = userList;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

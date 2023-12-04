package com.team.aphs.Dao;

import com.team.aphs.model.Permission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionDao {
    int deleteByPrimaryKey(Long id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}
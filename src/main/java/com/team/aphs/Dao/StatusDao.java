package com.team.aphs.Dao;

import com.team.aphs.model.Status;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusDao {
    int deleteByPrimaryKey(Long id);

    int insert(Status record);

    int insertSelective(Status record);

    Status selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);
}
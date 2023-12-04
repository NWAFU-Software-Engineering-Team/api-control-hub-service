package com.team.aphs.Dao;

import com.team.aphs.model.Body;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyDao {
    int deleteByPrimaryKey(Long id);

    int insert(Body record);

    int insertSelective(Body record);

    Body selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Body record);

    int updateByPrimaryKey(Body record);
}
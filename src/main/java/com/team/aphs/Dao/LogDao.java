package com.team.aphs.Dao;

import com.team.aphs.model.Log;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao {
    int deleteByPrimaryKey(Long id);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);
}
package com.team.aphs.Dao;

import com.team.aphs.model.Params;
import org.springframework.stereotype.Repository;

@Repository
public interface ParamsDao {
    int deleteByPrimaryKey(Long id);

    int insert(Params record);

    int insertSelective(Params record);

    Params selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Params record);

    int updateByPrimaryKey(Params record);
}
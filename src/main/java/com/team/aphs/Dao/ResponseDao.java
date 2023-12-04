package com.team.aphs.Dao;

import com.team.aphs.model.Response;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseDao {
    int deleteByPrimaryKey(Long id);

    int insert(Response record);

    int insertSelective(Response record);

    Response selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Response record);

    int updateByPrimaryKey(Response record);
}
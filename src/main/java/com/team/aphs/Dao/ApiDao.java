package com.team.aphs.Dao;

import com.team.aphs.model.Api;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiDao {
    int deleteByPrimaryKey(Long id);

    int insert(Api record);

    int insertSelective(Api record);

    Api selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Api record);

    int updateByPrimaryKey(Api record);
}
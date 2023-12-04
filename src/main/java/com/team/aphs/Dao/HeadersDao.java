package com.team.aphs.Dao;

import com.team.aphs.model.Headers;
import org.springframework.stereotype.Repository;

@Repository
public interface HeadersDao {
    int deleteByPrimaryKey(Long id);

    int insert(Headers record);

    int insertSelective(Headers record);

    Headers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Headers record);

    int updateByPrimaryKey(Headers record);
}
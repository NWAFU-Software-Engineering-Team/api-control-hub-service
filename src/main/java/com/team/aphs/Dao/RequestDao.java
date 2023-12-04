package com.team.aphs.Dao;

import com.team.aphs.model.Request;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestDao {
    int deleteByPrimaryKey(Long id);

    int insert(Request record);

    int insertSelective(Request record);

    Request selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Request record);

    int updateByPrimaryKey(Request record);
}
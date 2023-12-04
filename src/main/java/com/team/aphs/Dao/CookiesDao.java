package com.team.aphs.Dao;

import com.team.aphs.model.Cookies;
import org.springframework.stereotype.Repository;

@Repository
public interface CookiesDao {
    int deleteByPrimaryKey(Long id);

    int insert(Cookies record);

    int insertSelective(Cookies record);

    Cookies selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cookies record);

    int updateByPrimaryKey(Cookies record);
}
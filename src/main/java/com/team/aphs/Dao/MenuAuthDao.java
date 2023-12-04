package com.team.aphs.Dao;

import com.team.aphs.model.MenuAuth;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuAuthDao {
    int deleteByPrimaryKey(Long id);

    int insert(MenuAuth record);

    int insertSelective(MenuAuth record);

    MenuAuth selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MenuAuth record);

    int updateByPrimaryKey(MenuAuth record);
}
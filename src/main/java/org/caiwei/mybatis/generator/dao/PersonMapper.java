package org.caiwei.mybatis.generator.dao;

import org.apache.ibatis.annotations.Mapper;
import org.caiwei.mybatis.generator.domain.Person;
import org.springframework.stereotype.Repository;

/**
 * 相关人员表 Mapper
 * @date 2020-12-07
 */
@Mapper
@Repository
public interface PersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    Person selectByPrimaryKey(Long id);

    int updateByPrimaryKey(Person record);
}
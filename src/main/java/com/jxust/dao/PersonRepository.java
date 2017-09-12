package com.jxust.dao;

import com.jxust.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wangwz
 * Time: 20170912
 */
public interface PersonRepository extends JpaRepository<Person,Integer> {
    /**
     *  通过年龄来查询
     *  方法名固定
     * @param age
     * @return
     */
    public List<Person> findByAge(Integer age);
}

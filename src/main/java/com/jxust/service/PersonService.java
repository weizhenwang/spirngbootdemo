package com.jxust.service;


import com.jxust.dao.PersonRepository;
import com.jxust.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by wangwz
 * Time: 2017-09-10
 */
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    /**
     * 事务管理测试
     * 两条数据同时成功，或者同时不成功
     * 保证数据库数据的完整性和一致性
     */
    @Transactional
    public void insertTwo(){
        Person personA = new Person();
        personA.setName("我是数据一");
        personA.setAge(28);
        personRepository.save(personA);

        System.out.print(1/2);

        Person personB = new Person();
        personB.setName("我是数据二");
        personB.setAge(36);
        personRepository.save(personB);
    }
}

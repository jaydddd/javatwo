package com.qianfeng.mybatis.test;
import com.qianfeng.mybatis.dao.IUsersDAO;
import com.qianfeng.mybatis.dto.UsersDto;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by admin on 2018/3/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-core.xml")
public class UsersTest {
    private static  Logger logger = Logger.getLogger(UsersTest.class);
    @Autowired
    private IUsersDAO usersDAO;

    @Test
     public void getUsersValue(){
        List<UsersDto> userValue = usersDAO.getUserValue();
        for(UsersDto userDto:userValue){
            if(logger.isInfoEnabled()){
                logger.info(userDto.getUsersName());
            }

        }
    }
}

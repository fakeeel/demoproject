package cn.zhuyin.study.demoproject.serviceImpl;

import cn.zhuyin.study.demoproject.bean.UserBean;
import cn.zhuyin.study.demoproject.mapper.UserMapper;
import cn.zhuyin.study.demoproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuyin
 * @company
 * @create 2020-07-02 10:48
 */

@Service
public class UserServiceImpl implements UserService {

    //Dao注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}

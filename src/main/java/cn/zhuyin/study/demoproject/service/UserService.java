package cn.zhuyin.study.demoproject.service;

import cn.zhuyin.study.demoproject.bean.UserBean;

/**
 * @author zhuyin
 * @company
 * @create 2020-07-02 10:47
 */
public interface UserService {

    UserBean loginIn(String name,String password);

}

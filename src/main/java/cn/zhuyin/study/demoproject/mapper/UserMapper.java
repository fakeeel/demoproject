package cn.zhuyin.study.demoproject.mapper;

import cn.zhuyin.study.demoproject.bean.UserBean;

/**
 * @author zhuyin
 * @company
 * @create 2020-07-02 10:41
 */
public interface UserMapper {

    UserBean getInfo(String name,String password);
}

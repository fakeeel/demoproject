package cn.zhuyin.study.demoproject.controller;

import cn.zhuyin.study.demoproject.bean.UserBean;
import cn.zhuyin.study.demoproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhuyin
 * @company
 * @create 2020-07-02 10:57
 */
@Controller
public class LoginController {

    //Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value="/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if (userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }
}

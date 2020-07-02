package cn.zhuyin.study.demoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhuyin
 * @company
 * @create 2020-07-02 9:32
 */

@Controller
public class TestController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

}

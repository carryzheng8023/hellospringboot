package xin.carryzheng.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhengxin
 * @date 2018-09-20 20:30:08
 */

@Controller
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello " + name;
    }

}

package cn.aresoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test")
@RestController
public class TestController {

     @RequestMapping("test")
     public String test(){
          return "Hello World+测试测试测测测测测测测测测测测测测测测测测11111111111111111111111111111111";
     }
}

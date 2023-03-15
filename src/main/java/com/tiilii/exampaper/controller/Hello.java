package com.tiilii.exampaper.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiilii.exampaper.services.AsyncService;

/**
 * @ClassName: Hello
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author hunter
 * @date 2019年9月22日 下午10:48:23
 *
 */
@RestController
public class Hello {

    private static final Logger logger = LoggerFactory.getLogger(Hello.class);

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/hello")
    public String submit(){
        logger.info("start submit");

        //调用service层的任务
        asyncService.executeAsync();

        logger.info("end submit");

        return "success";
    }
}

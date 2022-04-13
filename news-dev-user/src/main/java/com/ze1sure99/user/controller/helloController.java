package com.ze1sure99.user.controller;

import com.ze1sure99.alex.result.GraceJSONResult;
import com.ze1sure99.api.controller.user.HelloControllerApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController implements HelloControllerApi {
    final static Logger logger = LoggerFactory.getLogger(helloController.class);
    //Swagger2 文档生成工具
    public Object hello(){
        logger.debug("debug:hello~");
        logger.info("info:hello~" );
        logger.warn("warn:hello~");
        logger.error("error:hello~");
//        return com.ze1sure99.ALEX.result.ALEXJSONResult.ok("hello");
//        return ALEXJSONResult.errorMsg("您的信息有误");
        return GraceJSONResult.ok();
    }
}

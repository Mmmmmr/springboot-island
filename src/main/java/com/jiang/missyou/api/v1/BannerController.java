package com.jiang.missyou.api.v1;

import com.jiang.missyou.exception.http.ForbiddenException;
import com.jiang.missyou.exception.http.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class BannerController {

    @GetMapping("/test")
    @ResponseBody

    public String test() throws Exception {
        if(true){
            throw new ForbiddenException(10001);
        }
        return "Hello,十二月";
    }
}

package springbootdubboconsumer.springbootdubboconsumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootdubboapi.springbootdubboapi.HelloService;

/**
 * @author Administrator
 * @create 2019-06-30
 * @since 1.0.0
 */
@RestController
@Component
public class HelloController {

    @Reference(url = "127.0.0.1:20880")
    private HelloService helloService;

    @GetMapping("/hello")
    public String SayHello(String name)
    {
        return helloService.SayHello(name);
    }

}

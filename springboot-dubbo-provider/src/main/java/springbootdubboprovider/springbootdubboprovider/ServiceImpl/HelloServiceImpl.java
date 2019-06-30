package springbootdubboprovider.springbootdubboprovider.ServiceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import springbootdubboapi.springbootdubboapi.HelloService;

import java.io.Serializable;

/**
 * @author Administrator
 * @create 2019-06-30
 * @since 1.0.0
 */


@Component
@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements springbootdubboapi.springbootdubboapi.HelloService, Serializable {

    @Override
    public String SayHello(String name) {
        return "hello " + name;
    }
}

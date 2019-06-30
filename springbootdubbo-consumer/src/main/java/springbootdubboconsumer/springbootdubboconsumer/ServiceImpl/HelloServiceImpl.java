//package springbootdubboconsumer.springbootdubboconsumer.ServiceImpl;
//
//import org.apache.dubbo.config.annotation.Reference;
//import org.apache.dubbo.config.annotation.Service;
//import org.springframework.stereotype.Component;
//import springbootdubboapi.springbootdubboapi.HelloService;
//
///**
// * @author Administrator
// * @create 2019-06-30
// * @since 1.0.0
// */
//
//@Service
//public class HelloServiceImpl implements HelloService {
//
//    @Reference(url="127.0.0.1:9001")
//    //@Reference(loadbalance="roundrobin")
//    HelloService helloService;
//
//    @Override
//    public String sayHello(String name)
//    {
//        return  helloService.sayHello(name);
//    }
//}

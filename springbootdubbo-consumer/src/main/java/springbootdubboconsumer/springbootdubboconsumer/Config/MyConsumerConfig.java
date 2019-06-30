//package springbootdubboconsumer.springbootdubboconsumer.Config;
//
//import com.sun.xml.internal.ws.api.FeatureConstructor;
//import org.apache.dubbo.config.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springbootdubboapi.springbootdubboapi.HelloService;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author Administrator
// * @create 2019-06-30
// * @since 1.0.0
// */
//@Configuration
//public class MyConsumerConfig {
//
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("boot-order-service-consumer");
//        return applicationConfig;
//    }
//
//      @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setProtocol("zookeeper");
//        registryConfig.setAddress("127.0.0.1:2181");
//        return registryConfig;
//    }
//
//
//
//    @Bean
//    public ReferenceConfig<HelloService> userReferenceConfig() {
//        ReferenceConfig<HelloService> serviceConfig = new ReferenceConfig<>();
//        serviceConfig.setInterface(HelloService.class);
//        serviceConfig.setTimeout(5000);
//        serviceConfig.setVersion("*");
//        serviceConfig.setRetries(3);
//
//        //配置每一个method的信息
//        MethodConfig methodConfig = new MethodConfig();
//        methodConfig.setName("sayHello");
//        methodConfig.setTimeout(1000);
//
//        //将method的设置关联到service配置中
//        List<MethodConfig> methods = new ArrayList<>();
//        methods.add(methodConfig);
//        serviceConfig.setMethods(methods);
//
//        return serviceConfig;
//    }
//
//    @Bean
//    public ConsumerConfig consumerConfig() {
//        ConsumerConfig consumerConfig = new ConsumerConfig();
//        consumerConfig.setCheck(false);
//        consumerConfig.setTimeout(5000);
//        return consumerConfig;
//    }
//
//     @Bean
//    public MonitorConfig monitorConfig() {
//        MonitorConfig monitorConfig = new MonitorConfig();
//        monitorConfig.setAddress("127.0.0.1:7070");
//        monitorConfig.setProtocol("registry");
//        return monitorConfig;
//    }
//}

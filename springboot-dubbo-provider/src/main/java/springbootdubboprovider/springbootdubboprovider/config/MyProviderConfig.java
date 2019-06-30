//package springbootdubboprovider.springbootdubboprovider.config;
//
//
//import org.apache.dubbo.config.*;
//import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
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
//public class MyProviderConfig {
//
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("springboot-dubbo-provider");
//        return applicationConfig;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setProtocol("zookeeper");
//        registryConfig.setAddress("127.0.0.1:2181");
//        return registryConfig;
//    }
//    @Bean
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig protocolConfig = new ProtocolConfig();
//        protocolConfig.setName("dubbo");
//        protocolConfig.setPort(20882);
//        protocolConfig.setPayload(16777216);
//        return protocolConfig;
//    }
//    @Bean
//    public ServiceConfig<HelloService> HelloServiceConfig(HelloService helloService){
//        ServiceConfig<HelloService> serviceConfig = new ServiceConfig<>();
//        serviceConfig.setInterface(HelloService.class);
//        serviceConfig.setRef(HelloService);
//        serviceConfig.setVersion("1.0.0");
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
//    public ProviderConfig providerConfig() {
//        ProviderConfig providerConfig = new ProviderConfig();
//        providerConfig.setTimeout(5000);
//        return providerConfig;
//    }
//    @Bean
//    public MonitorConfig monitorConfig() {
//        MonitorConfig monitorConfig = new MonitorConfig();
//        monitorConfig.setAddress("127.0.0.1:7070");
//        monitorConfig.setProtocol("registry");
//        return monitorConfig;
//    }
//}

package springbootdubboprovider.springbootdubboprovider;


import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
//@EnableDubbo(scanBasePackages={"springbootdubboprovider.springbootdubboprovider.ServiceImpl"})
@EnableDubboConfiguration
public class SpringbootDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboProviderApplication.class, args);

//        try {
//            TimeUnit.MINUTES.sleep(10); //提供者main线程暂停10分钟等待被调用
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.err.println("服务提供者------>>服务关闭");
    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.err.println("服务提供者------>>启动完毕");
//    }
}

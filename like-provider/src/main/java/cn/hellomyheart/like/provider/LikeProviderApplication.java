package cn.hellomyheart.like.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = "cn.hellomyheart.like.provider.mapper")
@EnableDiscoveryClient
public class LikeProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(LikeProviderApplication.class, args);
    }

}

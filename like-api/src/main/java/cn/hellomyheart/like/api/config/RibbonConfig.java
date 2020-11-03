package cn.hellomyheart.like.api.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @className: RibbonConfig
 * @package: cn.hellomyheart.like.api.config
 * @author: Stephen Shen
 * @date: 2020/11/3 下午5:27
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced //启用负载均衡
    public RestTemplate createRT() {
        return new RestTemplate();
    }

    //负载均衡的分发策略
    @Bean
    public IRule createRule() {
        //最小并发分配
        return new BestAvailableRule();
    }
}

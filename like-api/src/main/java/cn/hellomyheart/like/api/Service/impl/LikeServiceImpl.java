package cn.hellomyheart.like.api.Service.impl;

import cn.hellomyheart.like.common.dto.ContentLikeDto;
import cn.hellomyheart.like.common.dto.LikeAddDto;
import cn.hellomyheart.like.common.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @className: LikeServiceImpl
 * @package: cn.hellomyheart.like.api.Service.impl
 * @author: Stephen Shen
 * @date: 2020/11/3 下午5:35
 */
@Service
public class LikeServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

    public ResponseResult dz(LikeAddDto dto) {
        //        restTemplate.put();
        //        restTemplate.delete();
        //服务名+api路径地址
        return restTemplate.postForObject("http://StephenLikeProvider/provider/like/dz",dto,ResponseResult.class);
    }

    public ResponseResult all(){
        //服务名+api路径地址
        return restTemplate.getForObject("http://StephenLikeProvider/provider/like/count",ResponseResult.class);
    }
}

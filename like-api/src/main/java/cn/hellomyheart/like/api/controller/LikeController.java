package cn.hellomyheart.like.api.controller;

import cn.hellomyheart.like.api.Service.impl.LikeServiceImpl;
import cn.hellomyheart.like.common.dto.LikeAddDto;
import cn.hellomyheart.like.common.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description
 * @className: LikeController
 * @package: cn.hellomyheart.like.api.controller
 * @author: Stephen Shen
 * @date: 2020/11/3 下午5:34
 */
@RestController
@RequestMapping("/api/like")
public class LikeController {
    @Autowired
    private LikeServiceImpl service;

    /**
     * 点赞
     * @param dto
     * @return
     */
    @PostMapping("dz")
    public ResponseResult dz(@RequestBody LikeAddDto dto){
        return service.dz(dto);
    }

    /**
     * 查询
     * @return
     */
    @GetMapping("count")
    public ResponseResult all(){
        return service.all();
    }
}

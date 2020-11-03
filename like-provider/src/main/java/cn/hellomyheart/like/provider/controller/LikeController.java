package cn.hellomyheart.like.provider.controller;

import cn.hellomyheart.like.common.dto.LikeAddDto;
import cn.hellomyheart.like.common.vo.ResponseResult;
import cn.hellomyheart.like.provider.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description
 * @className: LikeController
 * @package: cn.hellomyheart.like.provider.controller
 * @author: Stephen Shen
 * @date: 2020/11/3 下午3:04
 */
@RestController
@RequestMapping("/provider/like/")
public class LikeController {
    @Autowired
    private LikeService likeService;

    /**
     * 点赞
     * @param dto
     * @return
     */
    @PostMapping("dz")
    public ResponseResult dz(@RequestBody LikeAddDto dto){
        return likeService.likev1(dto);
    }

    /**
     * 查询
     * @return
     */
    @GetMapping("count")
    public ResponseResult all(){
        return likeService.queryCount();
    }


}

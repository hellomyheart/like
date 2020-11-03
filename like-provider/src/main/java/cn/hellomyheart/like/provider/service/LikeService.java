package cn.hellomyheart.like.provider.service;

import cn.hellomyheart.like.common.dto.LikeAddDto;
import cn.hellomyheart.like.common.vo.ResponseResult;

/**
 * @description
 * @className: LikeService
 * @package: cn.hellomyheart.like.provider.service
 * @author: Stephen Shen
 * @date: 2020/11/3 下午3:46
 */
public interface LikeService {
    //第一版 点赞
    ResponseResult likev1(LikeAddDto dto);

    //查询文章点赞数量
    ResponseResult queryCount();

}

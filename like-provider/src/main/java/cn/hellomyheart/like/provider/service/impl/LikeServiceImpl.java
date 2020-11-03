package cn.hellomyheart.like.provider.service.impl;

import cn.hellomyheart.like.common.dto.LikeAddDto;
import cn.hellomyheart.like.common.vo.ResponseResult;
import cn.hellomyheart.like.entity.Like;
import cn.hellomyheart.like.provider.mapper.LikeMapper;
import cn.hellomyheart.like.provider.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description
 * @className: LikeServiceImpl
 * @package: cn.hellomyheart.like.provider.service.impl
 * @author: Stephen Shen
 * @date: 2020/11/3 下午4:30
 */
@Service
public class LikeServiceImpl implements LikeService {

    @Autowired
    private LikeMapper mapper;

    @Override
    public ResponseResult likev1(LikeAddDto dto) {
        if (mapper != null && dto.getCid() >0 && dto.getUid()>0){
            //1.校验是否点赞
            Like like = mapper.querySinle(dto);
            if (like == null){
                //需要点赞（新增）
                if (mapper.insert(dto)>0){
                    return ResponseResult.ok();
                } else {
                    return ResponseResult.fail("点赞失败");
                }
            } else {
                //取消点赞
                //删除
                if (mapper.del(dto)>0){
                    return ResponseResult.ok();
                }else {
                    return ResponseResult.fail("点赞失败");
                }
            }

        }


        return ResponseResult.fail("参数非法");
    }

    @Override
    public ResponseResult queryCount() {
        return ResponseResult.ok(mapper.queryCount());
    }
}

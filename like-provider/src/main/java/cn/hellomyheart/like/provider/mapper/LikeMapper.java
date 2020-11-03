package cn.hellomyheart.like.provider.mapper;

import cn.hellomyheart.like.common.dto.ContentLikeDto;
import cn.hellomyheart.like.common.dto.LikeAddDto;
import cn.hellomyheart.like.entity.Like;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description
 * @className: LikeMapper
 * @package: cn.hellomyheart.like.provider.mapper
 * @author: Stephen Shen
 * @date: 2020/11/3 下午4:36
 */
public interface LikeMapper {
    /**
     * 新增
     *
     * @param dto
     * @return
     */
    @Insert("insert into t_like(uid,cid,ctime) values(#{uid},#{cid},now())")
    int insert(LikeAddDto dto);

    /**
     * 删除
     *
     * @param dto
     * @return
     */
    @Delete("delete from t_like where uid=#{uid} and cid = #{cid}")
    int del(LikeAddDto dto);

    /**
     * 查询某个内容的点赞记录
     *
     * @param cid
     * @return
     */
    @Select("select * from t_like where cid= #{cid} order by ctime desc")
    @ResultType(Like.class)
    List<Like> queryByCid(int cid);

    /**
     * 查询是否点赞
     *
     * @param dto
     * @return
     */
    @Select("select * from t_like where uid=#{uid} and cid = #{cid} limit 1")
    @ResultType(Like.class)
    Like querySinle(LikeAddDto dto);

    /**
     * 查询点赞的数量
     * @return
     */
    @Select("select count(*)ct,cid from t_like group by cid")
    @ResultType(ContentLikeDto.class)
    List<ContentLikeDto> queryCount();


}

package cn.hellomyheart.like.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description
 * @className: Like
 * @package: cn.hellomyheart.like.entity
 * @author: Stephen Shen
 * @date: 2020/11/3 下午2:39
 */
@Data
public class Like {
    private Integer id;
    private Integer cid;
    private Integer uid;
    private Date ctime;
}

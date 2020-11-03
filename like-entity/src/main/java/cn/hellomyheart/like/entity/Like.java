package cn.hellomyheart.like.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description
 * @className: Like
 * @package: cn.hellomyheart.like.entity
 * @author: Stephen Shen
 * @date: 2020/11/3 下午2:39
 */
@Data
public class Like implements Serializable {
    private static final long serialVersionUID = 2917027156256007323L;
    private Integer id;
    private Integer cid;
    private Integer uid;
    private Date ctime;
}

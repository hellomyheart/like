package cn.hellomyheart.like.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description
 * @className: LikeAddDto
 * @package: cn.hellomyheart.like.common.dto
 * @author: Stephen Shen
 * @date: 2020/11/3 下午4:26
 */
@Data
public class LikeAddDto implements Serializable {
    private static final long serialVersionUID = -2008199140417163637L;
    private int uid;
    private int cid;
}

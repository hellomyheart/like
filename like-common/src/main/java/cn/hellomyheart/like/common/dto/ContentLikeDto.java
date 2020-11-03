package cn.hellomyheart.like.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description
 * @className: ContentLikeDto
 * @package: cn.hellomyheart.like.common.dto
 * @author: Stephen Shen
 * @date: 2020/11/3 下午4:28
 */
@Data
public class ContentLikeDto implements Serializable {
    private static final long serialVersionUID = 2981565465060992617L;
    private Integer cid;
    //点赞的数量
    private Long ct;
}

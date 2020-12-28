package online.icode.gomall.member.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 会员收藏专题活动.
 * @author 14356
 */
@Data
@TableName("ums_member_collect_subject")
public class MemberCollectSubject implements Serializable {

  private static final long serialVersionUID = 1602557259977907904L;
  @TableId
  private long id;
  private long subjectId;
  private String subjectName;
  private String subjectImg;
  private String subjectUrll;


}

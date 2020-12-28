package online.icode.gomall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 成长值变化历史记录表.
 * @author 14356
 */
@Data
@TableName(value = "ums_growth_change_history")
public class GrowthChangeHistory implements Serializable {

  private static final long serialVersionUID = -4842295924099272947L;
  @TableId
  private long id;
  private long memberId;
  private java.sql.Timestamp createTime;
  private long changeCount;
  private String note;
  private long sourceType;


}

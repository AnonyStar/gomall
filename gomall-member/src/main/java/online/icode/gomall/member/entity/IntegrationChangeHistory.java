package online.icode.gomall.member.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 积分变化历史记录表
 * @author AnonyStar
 */
@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistory implements Serializable {

  private static final long serialVersionUID = -2653574789963959394L;
  @TableId
  private long id;
  private long memberId;
  private Timestamp createTime;
  private long changeCount;
  private String note;
  private long sourceTyoe;


}

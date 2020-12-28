package online.icode.gomall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 会员等级.
 * @author 14356
 */
@Data
@TableName("ums_member_level")
public class MemberLevel implements Serializable {

  private static final long serialVersionUID = -7855589831179305051L;
  @TableId
  private long id;
  private String name;
  private long growthPoint;
  private long defaultStatus;
  private double freeFreightPoint;
  private long commentGrowthPoint;
  private long priviledgeFreeFreight;
  private long priviledgeMemberPrice;
  private long priviledgeBirthday;
  private String note;


}

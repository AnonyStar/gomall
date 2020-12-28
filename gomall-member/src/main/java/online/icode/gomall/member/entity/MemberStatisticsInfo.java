package online.icode.gomall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 会员统计信息
 * @author 14356
 */
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfo {

  @TableId
  private long id;
  private long memberId;
  private double consumeAmount;
  private double couponAmount;
  private long orderCount;
  private long couponCount;
  private long commentCount;
  private long returnOrderCount;
  private long loginCount;
  private long attendCount;
  private long fansCount;
  private long collectProductCount;
  private long collectSubjectCount;
  private long collectCommentCount;
  private long inviteFriendCount;



}

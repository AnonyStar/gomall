package online.icode.gomall.member.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 会员登陆记录表
 * @author 14356
 */
@Data
@TableName("ums_member_login_log")
public class MemberLoginLog {

  @TableId
  private long id;
  private long memberId;
  private java.sql.Timestamp createTime;
  private String ip;
  private String city;
  private long loginType;

}

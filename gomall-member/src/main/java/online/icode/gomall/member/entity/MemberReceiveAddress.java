package online.icode.gomall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 会员收货地址.
 * @author 14356
 */
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddress {

  @TableId
  private long id;
  private long memberId;
  private String name;
  private String phone;
  private String postCode;
  private String province;
  private String city;
  private String region;
  private String detailAddress;
  private String areacode;
  private long defaultStatus;


}

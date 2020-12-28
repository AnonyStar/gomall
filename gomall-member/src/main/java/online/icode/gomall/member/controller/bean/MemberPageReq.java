package online.icode.gomall.member.controller.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 会员.
 * @author 14356
 */
@Data
public class MemberPageReq {

  private long id;
  private long levelId;
  private String username;
  private String password;
  private String nickname;
  private String mobile;
  private String email;
  private String header;
  private long gender;
  private java.sql.Date birth;
  private String city;
  private String job;
  private String sign;
  private long sourceType;
  private long integration;
  private long growth;
  private long status;
  private java.sql.Timestamp createTime;

}

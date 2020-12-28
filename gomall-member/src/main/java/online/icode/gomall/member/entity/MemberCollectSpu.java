package online.icode.gomall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 会员收藏的商品.
 * @author 14356
 */
@TableName("ums_member_collect_spu")
public class MemberCollectSpu implements Serializable {

  private static final long serialVersionUID = 1992676518610318844L;
  @TableId
  private long id;
  private long memberId;
  private long spuId;
  private String spuName;
  private String spuImg;
  private java.sql.Timestamp createTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMemberId() {
    return memberId;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }


  public long getSpuId() {
    return spuId;
  }

  public void setSpuId(long spuId) {
    this.spuId = spuId;
  }


  public String getSpuName() {
    return spuName;
  }

  public void setSpuName(String spuName) {
    this.spuName = spuName;
  }


  public String getSpuImg() {
    return spuImg;
  }

  public void setSpuImg(String spuImg) {
    this.spuImg = spuImg;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}

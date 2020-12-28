package online.icode.gomall.member.mapper;

import online.icode.gomall.member.entity.MemberLoginLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 11:32:02
 */
@Mapper
public interface MemberLoginLogMapper extends BaseMapper<MemberLoginLog> {
	
}

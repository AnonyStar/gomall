package online.icode.gomall.member.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import online.icode.gomall.member.entity.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: zhoucx
 * @time: 2020/12/11 16:06
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {
}

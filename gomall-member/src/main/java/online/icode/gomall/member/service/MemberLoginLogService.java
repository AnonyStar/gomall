package online.icode.gomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberLoginLog;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 11:32:02
 */
public interface MemberLoginLogService extends IService<MemberLoginLog> {

    PageUtils queryPage(Map<String, Object> params);
}


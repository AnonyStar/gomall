package online.icode.gomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberLevel;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员等级
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 11:32:02
 */

public interface MemberLevelService extends IService<MemberLevel> {

    PageUtils queryPage(Map<String, Object> params);
}


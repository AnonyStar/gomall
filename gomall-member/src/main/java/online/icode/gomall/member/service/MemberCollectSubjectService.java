package online.icode.gomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberCollectSubject;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 11:32:02
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubject> {

    PageUtils queryPage(Map<String, Object> params);
}


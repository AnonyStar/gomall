package online.icode.gomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberCollectSpu;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 11:32:02
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpu> {

    PageUtils queryPage(Map<String, Object> params);
}


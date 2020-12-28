package online.icode.gomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberReceiveAddress;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 11:32:02
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddress> {

    PageUtils queryPage(Map<String, Object> params);
}


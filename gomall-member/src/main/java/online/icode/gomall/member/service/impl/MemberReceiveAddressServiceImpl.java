package online.icode.gomall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberReceiveAddress;
import online.icode.gomall.member.mapper.MemberReceiveAddressMapper;
import online.icode.gomall.member.service.MemberReceiveAddressService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: zhoucx
 * @time: 2020/12/23 14:25
 */
@Service
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressMapper, MemberReceiveAddress> implements MemberReceiveAddressService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }
}

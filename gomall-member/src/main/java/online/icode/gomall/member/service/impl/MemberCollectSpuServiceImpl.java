package online.icode.gomall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberCollectSpu;
import online.icode.gomall.member.mapper.MemberCollectSpuMapper;
import online.icode.gomall.member.service.MemberCollectSpuService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: zhoucx
 * @time: 2020/12/23 14:19
 */
@Service
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuMapper, MemberCollectSpu> implements MemberCollectSpuService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }
}

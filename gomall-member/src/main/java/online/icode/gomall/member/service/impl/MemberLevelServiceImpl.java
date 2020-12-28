package online.icode.gomall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberLevel;
import online.icode.gomall.member.mapper.MemberLevelMapper;
import online.icode.gomall.member.service.MemberLevelService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: zhoucx
 * @time: 2020/12/23 14:22
 */
@Service
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevel> implements MemberLevelService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }
}

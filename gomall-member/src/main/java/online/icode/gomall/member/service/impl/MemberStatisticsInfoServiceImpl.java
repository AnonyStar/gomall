package online.icode.gomall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberStatisticsInfo;
import online.icode.gomall.member.mapper.MemberStatisticsInfoMapper;
import online.icode.gomall.member.service.MemberStatisticsInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: zhoucx
 * @time: 2020/12/23 14:26
 */
@Service
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoMapper, MemberStatisticsInfo> implements MemberStatisticsInfoService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }
}

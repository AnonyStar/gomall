package online.icode.gomall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.IntegrationChangeHistory;
import online.icode.gomall.member.mapper.IntegrationChangeHistoryMapper;
import online.icode.gomall.member.service.IntegrationChangeHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: zhoucx
 * @time: 2020/12/23 14:18
 */
@Service
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryMapper, IntegrationChangeHistory> implements IntegrationChangeHistoryService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }
}

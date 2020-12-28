package online.icode.gomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.IntegrationChangeHistory;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 11:32:02
 */

public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistory> {

    PageUtils queryPage(Map<String, Object> params);
}


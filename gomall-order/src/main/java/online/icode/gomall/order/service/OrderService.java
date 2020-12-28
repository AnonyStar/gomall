package online.icode.gomall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 14:55:46
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


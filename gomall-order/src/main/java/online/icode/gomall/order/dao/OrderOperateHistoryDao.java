package online.icode.gomall.order.dao;

import online.icode.gomall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 14:55:46
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}

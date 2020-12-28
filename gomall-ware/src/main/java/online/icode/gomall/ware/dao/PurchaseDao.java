package online.icode.gomall.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import online.icode.gomall.ware.entity.PurchaseEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 14:59:26
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}

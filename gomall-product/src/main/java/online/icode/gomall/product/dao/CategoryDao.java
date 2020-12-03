package online.icode.gomall.product.dao;

import online.icode.gomall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-03 17:04:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

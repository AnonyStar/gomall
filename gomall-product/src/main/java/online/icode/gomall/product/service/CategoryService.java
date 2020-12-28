package online.icode.gomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.product.entity.CategoryEntity;
import online.icode.gomall.product.vo.CategoryVo;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-03 17:04:18
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询树结构列表.
     * @return
     */
    List<CategoryVo> listWithTree();

    /**
     * 根据caid集合删除相应的节点.
     * @param asList
     */
    void removeMenusByIds(List<Long> asList);
}


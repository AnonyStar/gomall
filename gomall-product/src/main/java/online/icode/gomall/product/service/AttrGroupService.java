package online.icode.gomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-03 17:04:18
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package online.icode.gomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-03 17:04:18
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


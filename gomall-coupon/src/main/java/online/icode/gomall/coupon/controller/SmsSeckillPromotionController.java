package online.icode.gomall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import online.icode.gomall.coupon.entity.SmsSeckillPromotionEntity;
import online.icode.gomall.coupon.service.SmsSeckillPromotionService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.common.utils.R;



/**
 * 秒杀活动
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 14:51:47
 */
@RestController
@RequestMapping("coupon/smsseckillpromotion")
public class SmsSeckillPromotionController {
    @Autowired
    private SmsSeckillPromotionService smsSeckillPromotionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:smsseckillpromotion:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSeckillPromotionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:smsseckillpromotion:info")
    public R info(@PathVariable("id") Long id){
		SmsSeckillPromotionEntity smsSeckillPromotion = smsSeckillPromotionService.getById(id);

        return R.ok().put("smsSeckillPromotion", smsSeckillPromotion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:smsseckillpromotion:save")
    public R save(@RequestBody SmsSeckillPromotionEntity smsSeckillPromotion){
		smsSeckillPromotionService.save(smsSeckillPromotion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:smsseckillpromotion:update")
    public R update(@RequestBody SmsSeckillPromotionEntity smsSeckillPromotion){
		smsSeckillPromotionService.updateById(smsSeckillPromotion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:smsseckillpromotion:delete")
    public R delete(@RequestBody Long[] ids){
		smsSeckillPromotionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

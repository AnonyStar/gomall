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

import online.icode.gomall.coupon.entity.SmsSpuBoundsEntity;
import online.icode.gomall.coupon.service.SmsSpuBoundsService;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.common.utils.R;



/**
 * 商品spu积分设置
 *
 * @author AnonyStar
 * @email AnonyStarCode@gmail.com
 * @date 2020-12-23 14:51:47
 */
@RestController
@RequestMapping("coupon/smsspubounds")
public class SmsSpuBoundsController {
    @Autowired
    private SmsSpuBoundsService smsSpuBoundsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:smsspubounds:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsSpuBoundsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:smsspubounds:info")
    public R info(@PathVariable("id") Long id){
		SmsSpuBoundsEntity smsSpuBounds = smsSpuBoundsService.getById(id);

        return R.ok().put("smsSpuBounds", smsSpuBounds);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:smsspubounds:save")
    public R save(@RequestBody SmsSpuBoundsEntity smsSpuBounds){
		smsSpuBoundsService.save(smsSpuBounds);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:smsspubounds:update")
    public R update(@RequestBody SmsSpuBoundsEntity smsSpuBounds){
		smsSpuBoundsService.updateById(smsSpuBounds);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:smsspubounds:delete")
    public R delete(@RequestBody Long[] ids){
		smsSpuBoundsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

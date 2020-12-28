package online.icode.gomall.member.feign;

import online.icode.gomall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author: zhoucx
 * @time: 2020/12/23 16:14
 */
@FeignClient("gomall-coupon")
public interface CouponFeignService {

    @GetMapping("coupon/coupon/list")
    public R list(@RequestParam Map<String, Object> params);


}

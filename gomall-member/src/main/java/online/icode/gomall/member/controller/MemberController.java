package online.icode.gomall.member.controller;

import online.icode.gomall.common.utils.R;
import online.icode.gomall.member.controller.bean.MemberPageReq;
import online.icode.gomall.member.entity.Member;
import online.icode.gomall.member.feign.CouponFeignService;
import online.icode.gomall.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: zhoucx
 * @time: 2020/12/11 16:46
 */
@RestController
@RequestMapping("member/user")
public class MemberController {

    @Autowired
    private MemberService memberServicel;
    @Autowired
    private CouponFeignService couponFeignService;

    @GetMapping("list")
    public R list(MemberPageReq req){
        List<Member> page = memberServicel.queryPage(req);
        Map<String,Object> map = new HashMap<>();
        final R list = couponFeignService.list(map);
        return R.ok().put("page",page).put("coupon",list);
    }
}

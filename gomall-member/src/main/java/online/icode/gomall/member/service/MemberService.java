package online.icode.gomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import online.icode.gomall.member.controller.bean.MemberPageReq;
import online.icode.gomall.member.entity.Member;

import java.util.List;

/**
 * @author: zhoucx
 * @time: 2020/12/11 16:21
 */
public interface MemberService extends IService<Member> {

    List<Member> queryPage(MemberPageReq req);
}

package online.icode.gomall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import online.icode.gomall.common.utils.Query;
import online.icode.gomall.member.controller.bean.MemberPageReq;
import online.icode.gomall.member.entity.Member;
import online.icode.gomall.member.mapper.MemberMapper;
import online.icode.gomall.member.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

/**
 * @author: zhoucx
 * @time: 2020/12/11 16:21
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {


    @Override
    public List<Member> queryPage(MemberPageReq req) {

        final Page<Member> page = this.page(new Page<>());
        final List<Member> records = page.getRecords();
        return records;

    }
}

package online.icode.gomall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.member.entity.MemberCollectSubject;
import online.icode.gomall.member.mapper.MemberCollectSubjectMapper;
import online.icode.gomall.member.service.MemberCollectSubjectService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author: zhoucx
 * @time: 2020/12/23 14:21
 */
@Service
public class MemberCollectSubjectServiceImpl extends ServiceImpl<MemberCollectSubjectMapper, MemberCollectSubject> implements MemberCollectSubjectService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }
}

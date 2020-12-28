package online.icode.gomall.product.service.impl;

import online.icode.gomall.product.vo.CategoryVo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import online.icode.gomall.common.utils.PageUtils;
import online.icode.gomall.common.utils.Query;

import online.icode.gomall.product.dao.CategoryDao;
import online.icode.gomall.product.entity.CategoryEntity;
import online.icode.gomall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryVo> listWithTree() {
        //1.查询所有数据
        final List<CategoryEntity> entityList = baseMapper.selectList(null);

        List<CategoryVo> list = new ArrayList<>();
        //2. 构建列表
       entityList.stream()
               .forEach(cate -> {
                    try {
                        list.add(cate.clone(CategoryVo.class));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    }
                });

        final List<CategoryVo> collect = list.stream()
                .filter(cate -> cate.getParentCid() == 0)
                .map(cate -> {
                    cate.setCategoryVo(getChildren(cate,list));
                    return cate;
                })
                .sorted(Comparator.comparingInt(CategoryVo::getSort))
                .collect(Collectors.toList());

        return collect;

    }

    @Override
    public void removeMenusByIds(List<Long> asList) {
        final int i = baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryVo> getChildren(CategoryVo root, List<CategoryVo> total) {
        final List<CategoryVo> list = total.stream()
                .filter(cate -> cate.getParentCid() == root.getCatId())
                .map(cate -> {
                    cate.setCategoryVo(getChildren(cate, total));
                    return cate;
                })
                .sorted(Comparator.comparingInt(s -> (s.getSort() == null ? 0 : s.getSort())))
                .collect(Collectors.toList());

        return list;
    }

}
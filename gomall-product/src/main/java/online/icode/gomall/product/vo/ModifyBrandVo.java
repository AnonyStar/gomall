package online.icode.gomall.product.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.icode.gomall.product.entity.BrandEntity;
import org.springframework.cglib.beans.BeanCopier;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author: zhoucx
 * @time: 2021/1/2 20:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModifyBrandVo {
    /**
     * 品牌id
     */
    @NotNull
    private Long brandId;
    /**
     * 品牌名
     */
    @NotNull
    private String name;
    /**
     * 品牌logo地址
     */
    @NotBlank
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Integer showStatus;
    /**
     * 检索首字母
     */
    private String firstLetter;
    /**
     * 排序
     */
    private Integer sort;

    public <T> T clone(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        BeanCopier beanCopier = BeanCopier.create(this.getClass(),clazz,false);
        final T instance = clazz.newInstance();
        beanCopier.copy(this,instance,null);
        return instance;
    }
}

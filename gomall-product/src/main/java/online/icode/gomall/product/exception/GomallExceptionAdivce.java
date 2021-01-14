package online.icode.gomall.product.exception;

import lombok.extern.slf4j.Slf4j;
import online.icode.gomall.common.exception.BizCodeEnum;
import online.icode.gomall.common.utils.R;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhoucx
 * @time: 2021/1/2 21:36
 */

@Slf4j
@RestControllerAdvice(basePackages = {"online.icode.gomall.product.controller"})
public class GomallExceptionAdivce {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R validParams(MethodArgumentNotValidException exception){
        Map<String,String> re = new HashMap<>();
        final BindingResult result = exception.getBindingResult();
        result.getFieldErrors().forEach(item -> {
            re.put(item.getField(),item.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(),BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data",re);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){
        log.error("未知异常{},异常类型{}",throwable.getMessage(),throwable.getClass());
        return R.error(BizCodeEnum.UNKNOW_EXEPTION.getCode(), BizCodeEnum.UNKNOW_EXEPTION.getMsg());
    }
}

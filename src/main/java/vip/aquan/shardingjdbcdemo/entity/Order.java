package vip.aquan.shardingjdbcdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
/**
 * @author: wcp
 * @date: 2022/9/4 17:27
 * @Description:
 */
@Data
@TableName(value = "t_order")
public class Order {

    private Long orderId;
    private BigDecimal price;
    private Integer userId;
    private String status;
}

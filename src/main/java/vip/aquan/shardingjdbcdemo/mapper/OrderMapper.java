package vip.aquan.shardingjdbcdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import vip.aquan.shardingjdbcdemo.entity.Order;

/**
 * @author: wcp
 * @date: 2022/9/4 17:27
 * @Description:
 */
@Repository
public interface OrderMapper extends BaseMapper<Order> {
}

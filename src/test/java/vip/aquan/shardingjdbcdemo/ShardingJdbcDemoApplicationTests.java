package vip.aquan.shardingjdbcdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import vip.aquan.shardingjdbcdemo.entity.Order;
import vip.aquan.shardingjdbcdemo.mapper.OrderMapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShardingJdbcDemoApplicationTests {

    @Autowired
    OrderMapper orderMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void addOrder(){
        for(int i=1;i<=10;i++) {
            Order order = new Order();
            order.setPrice(new BigDecimal(i*10+20));
            order.setUserId(new Random().nextInt(10));
            order.setStatus("SUCCESS");
            orderMapper.insert(order);
        }
    }

    @Test
    public void getOrders(){
        List<Order> orders = orderMapper.selectList(new QueryWrapper<>());
        System.out.println("size:"+orders.size());
        orders.forEach(System.out::println);
    }

}

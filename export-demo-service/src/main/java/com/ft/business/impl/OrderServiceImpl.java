package com.ft.business.impl;

import com.ft.business.api.IOrderService;
import com.ft.business.param.MyOrderParam;
import com.ft.business.resp.MyOrderPageResp;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author mask
 * @date 2019/6/14 21:21
 * @desc
 */
@Service("orderService")
public class OrderServiceImpl implements IOrderService {
    @Override
    public List<MyOrderPageResp> findByCondition(MyOrderParam myOrderParam) {
        System.out.println("进入实际的方法啦findByCondition");
        MyOrderPageResp myOrderPageResp = new MyOrderPageResp();
        myOrderPageResp.setOrderNo("SO19921226");
        myOrderPageResp.setOrderTime(new Date());
        myOrderPageResp.setOrderStatus(2);
        myOrderPageResp.setTotalPrice(new BigDecimal(100.22));
        myOrderPageResp.setDoublePride(399.12);

        return Arrays.asList(myOrderPageResp);
    }

    @Override
    public Long findCountByCondition(MyOrderParam myOrderParam) {
        System.out.println("进入实际的方法啦findCountByCondition");
        return 1000L;
    }

    @Override
    public Integer findExportListCount(MyOrderParam myOrderParam) {
        System.out.println("进入实际的方法啦findExportListCount");
        return 100000;
    }

    @Override
    public List<MyOrderPageResp> findExportList(MyOrderParam myOrderParam) {

        List<MyOrderPageResp> resultList = new ArrayList<>(2000);
        System.out.println("进入实际的方法啦findByCondition");
        MyOrderPageResp myOrderPageResp = new MyOrderPageResp();
        myOrderPageResp.setOrderNo("SO19921226");
        myOrderPageResp.setOrderTime(new Date());
        myOrderPageResp.setOrderStatus(2);
        myOrderPageResp.setTotalPrice(new BigDecimal(100.22));
        myOrderPageResp.setDoublePride(399.12);
        for (int i =1 ; i<= 2000; i++){
            resultList.add(myOrderPageResp);
        }

        return resultList;
    }
}

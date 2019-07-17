package com.ft.business.resp;

import com.ft.export.annotation.ExportField;
import com.ft.export.enums.FieldTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author mask
 * @date 2019/6/10 17:56
 * @desc
 */
@Data
public class MyOrderPageResp implements Serializable{
    @ExportField(headName = "订单号", fieldTypeEnum = FieldTypeEnum.Str)
    private String orderNo;

    @ExportField(headName = "下单时间", fieldTypeEnum = FieldTypeEnum.Date)
    private Date orderTime;

    @ExportField(headName = "订单状态", fieldTypeEnum = FieldTypeEnum.FormatStr, formatStr = "1=待支付&2=已支付&3=已发货&未知状态")
    private Integer orderStatus;

    @ExportField(headName = "订单总价", fieldTypeEnum = FieldTypeEnum.Number)
    private BigDecimal totalPrice;

    @ExportField(headName = "支付金额", fieldTypeEnum = FieldTypeEnum.Number)
    private Double DoublePride;
}

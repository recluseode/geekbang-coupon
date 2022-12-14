package com.geekbang.coupon.beans;

import com.geekbang.coupon.beans.rules.TemplateRule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * 优惠券模版信息
 *
 * @author wuyuexiang
 * @date 2022年09月12日 00:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplateInfo {

    private Long id;

    @NotNull
    private String name;

    // 优惠券描述
    @NotNull
    private String desc;

    // 优惠券类型
    @NotNull
    private Integer type;

    // 适用门店 - 若无则为全店通用券
    private Long shopId;

    /** 优惠券规则 */
    @NotNull
    private TemplateRule rule;

    private Boolean available;
}

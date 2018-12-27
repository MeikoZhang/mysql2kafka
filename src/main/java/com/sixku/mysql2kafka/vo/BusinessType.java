package com.sixku.mysql2kafka.vo;

public enum BusinessType {

    //注册
    REGISTER("udai_register"),
    //申请
    APPLY("udai_apply"),
    //进件
    LOAN("udai_loan"),
    //审批通过
    APPROVAL("udai_approval"),
    //签约
    CONTRACT("udai_contract"),
    //签约金额
    CONTRACT_MONEY("udai_contract_money"),
    //放款
    PUTOUT("udai_putout");

    private String name;

    BusinessType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

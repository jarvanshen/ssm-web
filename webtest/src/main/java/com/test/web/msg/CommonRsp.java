package com.test.web.msg;

public class CommonRsp {

    private String code;
    private String descrisbtion;

    public CommonRsp() {
        super();
        this.code="0";
        this.descrisbtion="success";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescrisbtion() {
        return descrisbtion;
    }

    public void setDescrisbtion(String descrisbtion) {
        this.descrisbtion = descrisbtion;
    }
}

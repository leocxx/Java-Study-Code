package com.xxxxxchen.override;

public class iPaerV2 extends iPaerV1{
    /*
     * 1.定义手机类 iPearV2
     *           call (String name) :打电话
     *            smallBlack() : 语音助手 （speak english... 说中文）
     */
    public void smallBlack(){
        super.smallBlack();
        System.out.println("说中文");
    }
}

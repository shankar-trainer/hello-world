package com.wipro.inheritance;

public class Mobile {
    private long modbileId;
    private  String  modbileModel;
    private float modbileCost;

    public Mobile(long modbileId, String modbileModel, float modbileCost) {
        this.modbileId = modbileId;
        this.modbileModel = modbileModel;
        this.modbileCost = modbileCost;
    }

    @Override
    public String toString() {
        return "Mobile Info " +
                "\n\tmodbileId=" + modbileId +
                "\n\tmodbileModel='" + modbileModel +
                "\n\tmodbileCost=" + modbileCost ;
    }
}

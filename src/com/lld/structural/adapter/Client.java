package com.lld.structural.adapter;

import com.lld.structural.adapter.adaptee.WeightMachineForBabies;
import com.lld.structural.adapter.adapter.WeightMachineAdapter;
import com.lld.structural.adapter.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String args[]){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }

}

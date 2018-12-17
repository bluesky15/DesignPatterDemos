package com.lkb.factory;

public class TestComputerFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","2 GB","500GB","2.4GHz");
        Computer server = ComputerFactory.getComputer("Server","16 GB","1 TB","3.5 GHz");
        System.out.println("Factory PC config:: "+pc);
        System.out.println("Factory Server config:: "+server);

    }
}

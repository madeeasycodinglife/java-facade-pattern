package com.madeeasy;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Starting computer...");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer started and ready to use");
    }
}

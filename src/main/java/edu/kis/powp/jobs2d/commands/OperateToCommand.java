package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverCommand;

public class OperateToCommand implements DriverCommand {
    private Job2dDriver driver;
    private int x;
    private int y;

    @Override
    public void execute() {
        driver.operateTo(x, y);
    }

    public OperateToCommand(Job2dDriver driver, int x, int y) {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }
}

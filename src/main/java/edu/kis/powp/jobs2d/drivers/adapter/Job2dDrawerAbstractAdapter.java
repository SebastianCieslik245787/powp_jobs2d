package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Job2dDrawerAbstractAdapter extends AbstractDriver {
    private Job2dDriver job2dDriver;

    public Job2dDrawerAbstractAdapter(Job2dDriver driver) {
        super(0,0);
        this.job2dDriver = driver;
    }

    @Override
    public void operateTo(int i, int i1) {
        job2dDriver.setPosition(this.getX(), this.getY());
        job2dDriver.operateTo(i, i1);
        setPosition(i, i1);
    }
}

package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.Job2dDrawerAbstractAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Figure Joe 1")) {
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals("Figure Joe 2")) {
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals("Figure Jane")) {
			FiguresJane.figureScript(new Job2dDrawerAbstractAdapter(driverManager.getCurrentDriver()));
		}
		else if(e.getActionCommand().equals("Figure Sebastian 1")) {
			DriverCommand driverCommandSet1 = new SetPositionCommand(0, 0);
			DriverCommand driverCommandOperate1 = new OperateToCommand(0, 100);
			DriverCommand driverCommandOperate2 = new OperateToCommand(100, 50);
			DriverCommand driverCommandOperate3 = new OperateToCommand(0, 0);

			driverCommandSet1.execute(driverManager.getCurrentDriver());
			driverCommandOperate1.execute(driverManager.getCurrentDriver());
			driverCommandOperate2.execute(driverManager.getCurrentDriver());
			driverCommandOperate3.execute(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals("Figure Sebastian 2")) {
			ComplexCommand complexCommand = new ComplexCommand();
			complexCommand.addCommand(new SetPositionCommand(0, 0));
			complexCommand.addCommand(new OperateToCommand(0, 200));
			complexCommand.addCommand(new OperateToCommand(100, 200));
			complexCommand.addCommand(new OperateToCommand(100, 0));
			complexCommand.addCommand(new OperateToCommand(0, 0));

			complexCommand.execute(driverManager.getCurrentDriver());
		}
		else if(e.getActionCommand().equals("Figure Sebastian 3")) {
			ComplexCommand complexCommand = new ComplexCommand();
			complexCommand.addCommand(new SetPositionCommand(-100, 0));
			complexCommand.addCommand(new OperateToCommand(0, -100));
			complexCommand.addCommand(new OperateToCommand(100, 0));
			complexCommand.addCommand(new OperateToCommand(0, 100));
			complexCommand.addCommand(new OperateToCommand(-100, 0));

			complexCommand.execute(driverManager.getCurrentDriver());
		}

		else if(e.getActionCommand().equals("Figure Sebastian 4")) {
			ComplexCommand complexCommand = new ComplexCommand();
			complexCommand.addCommand(new SetPositionCommand(-100, 50));
			complexCommand.addCommand(new OperateToCommand(-100, -50));
			complexCommand.addCommand(new OperateToCommand(-50, -100));
			complexCommand.addCommand(new OperateToCommand(50, -100));
			complexCommand.addCommand(new OperateToCommand(100, -50));
			complexCommand.addCommand(new OperateToCommand(100, 50));
			complexCommand.addCommand(new OperateToCommand(50, 100));
			complexCommand.addCommand(new OperateToCommand(-50, 100));
			complexCommand.addCommand(new OperateToCommand(-100, 50));

			complexCommand.execute(driverManager.getCurrentDriver());
		}
	}
}

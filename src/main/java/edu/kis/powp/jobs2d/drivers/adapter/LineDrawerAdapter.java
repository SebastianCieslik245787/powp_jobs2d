package edu.kis.powp.jobs2d.drivers.adapter;


import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;

public class LineDrawerAdapter extends Job2dDrawer {
    private final int startX = 0;
    private final int startY = 0;
    private ILine line;
    private DrawPanelController drawPanelController;

    public LineDrawerAdapter(DrawPanelController drawPanelController, ILine line) {
        super(drawPanelController);
        this.drawPanelController = drawPanelController;
        this.line = line;
    }

    @Override
    public void operateTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        setPosition(x, y);
        this.drawPanelController.drawLine(line);
    }

}

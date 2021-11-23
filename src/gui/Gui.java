package gui;

import java.util.List;

import logikUndMengen.Aussageform;
import logikUndMengen.Variable;
import xGui.PresetStep;
import xGui.SplitGetter;
import xGui.XMenuBar;
import xGui.XPanel;
import xPresets.XIdePreset;

public class Gui extends XIdePreset {

	private static final long serialVersionUID = 1L;
	
	public Gui() {
		super("Mathe mann", "mathemann.jpg", "sus");
	}

	@Override
	public List<SplitGetter> getSplitGetter() {
		return null;
	}

	@Override
	public void initHeaderLeftMenuBar(XMenuBar menubar) {
		
	}

	@Override
	public void initHeaderRightContent(XPanel panel) {
		
	}

	@Override
	public PresetStep getPresetSteps() {
		return null;
	}
	
	public static void main(String[] args) {
//		new Gui();
		
		Variable x = new Variable("x", 5);
		Aussageform a = new Aussageform("x < 3", x);
		System.out.println(a);
		x.setValue(2);
		System.out.println(a);
	}
}
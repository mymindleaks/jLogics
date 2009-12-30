/*
 * Created on May 5, 2004
 */
package toolbar;

import gates.Gate;

import javax.swing.JButton;

import actions.GateAddingAction;

/**
 * @author maheshexp
 */
public class LEDButton extends JButton {
	public LEDButton() {
		super("LED");
		this.addActionListener(new GateAddingAction(Gate.LED));
	}
}
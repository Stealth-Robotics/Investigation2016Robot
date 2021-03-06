package org.usfirst.frc4089.Investigation2016Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AutoOptions {
	public static final String[] Options = new String[] {
    		"Low Bar 1",
    		"Moat/Rampart 3/4",
    		"Rock Wall/Rough Terrain 3/4",
    		"Moat/Rampart 2",
    		"Rock Wall/Rough Terrain 2",
    		"ChevyChase 3/4",
    		"ChevyChase 2",
    		"Moat/Rampart 5",
    		"Rock Wall/Rough Terrain 5",
    		"ChevyChase 5",
    		"Any Other (Disabled)"};
	
	public static final Command[] AssociatedCommands = new Command[] {
		//TODO add commands	
	};
	
	public Command getAutoCommandFromString(String[] chosen)
	{
		if(Options.length != AssociatedCommands.length) return null;
		for(int i = 0; i < Options.length; i++)
		{
			if(Options[i].equals(chosen)){
				return AssociatedCommands[i];
			}
		}
		return null; //for now
	}
}

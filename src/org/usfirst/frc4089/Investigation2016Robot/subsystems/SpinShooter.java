// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4089.Investigation2016Robot.subsystems;

import org.usfirst.frc4089.Investigation2016Robot.RobotMap;
import org.usfirst.frc4089.Investigation2016Robot.commands.*;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class SpinShooter extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DoubleSolenoid spinShooterElevate = RobotMap.spinShooterSpinShooterElevate;
    private final Solenoid spinSolenoid = RobotMap.spinShooterSpinSolenoid;
    private final CANTalon leftSpin = RobotMap.spinShooterLeftSpin;
    private final CANTalon rightSpin = RobotMap.spinShooterRightSpin;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void dynSpinShoot(double leftSpeed , double rightSpeed ){
    	leftSpin.set(leftSpeed);
    	rightSpin.set(-rightSpeed);
    }
    public void stopShoot(){
    	leftSpin.set(0);
    	rightSpin.set(0);
    }
    public void spinRaise(){
    	spinSolenoid.set(true);
    }
    public void spinLower(){
    	spinSolenoid.set(false);
    }
}


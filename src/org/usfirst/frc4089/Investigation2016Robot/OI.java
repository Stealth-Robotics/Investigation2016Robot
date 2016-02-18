// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4089.Investigation2016Robot;

import org.usfirst.frc4089.Investigation2016Robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4089.Investigation2016Robot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton shifter;
    public JoystickButton driveJSB1;
    public JoystickButton driveJSB3;
    public JoystickButton driveJSB4;
    public JoystickButton driveJSB5;
    public Joystick driveJS;
    public JoystickButton button2;
    public JoystickButton button3;
    public JoystickButton trigger;
    public JoystickButton button4;
    public JoystickButton button5;
    public JoystickButton utilJSB6;
    public JoystickButton utilJSB7;
    public JoystickButton utilJSB8;
    public Joystick utilJS;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        utilJS = new Joystick(1);
        
        utilJSB8 = new JoystickButton(utilJS, 8);
        utilJSB8.whileHeld(new CollectorRunWheelsOut());
        utilJSB7 = new JoystickButton(utilJS, 7);
        utilJSB7.whileHeld(new CollectorRunWheelsIn());
        utilJSB6 = new JoystickButton(utilJS, 6);
        utilJSB6.whileHeld(new ShooterSpinWheels());
        button5 = new JoystickButton(utilJS, 5);
        button5.whenPressed(new Retract());
        button4 = new JoystickButton(utilJS, 4);
        button4.whenPressed(new Throw());
        trigger = new JoystickButton(utilJS, 1);
        trigger.whileHeld(new AutoShoot());
        button3 = new JoystickButton(utilJS, 3);
        button3.whileHeld(new ClimbUp());
        button2 = new JoystickButton(utilJS, 2);
        button2.whileHeld(new ClimbDown());
        driveJS = new Joystick(0);
        
        driveJSB5 = new JoystickButton(driveJS, 5);
        driveJSB5.whenPressed(new CollectorExtend());
        driveJSB4 = new JoystickButton(driveJS, 4);
        driveJSB4.whenPressed(new CollectorRetract());
        driveJSB3 = new JoystickButton(driveJS, 3);
        driveJSB3.whenPressed(new CollectorStage());
        driveJSB1 = new JoystickButton(driveJS, 1);
        driveJSB1.whileHeld(new CollectorRunWheelsIn());
        shifter = new JoystickButton(driveJS, 2);
        shifter.whenPressed(new Shift());


        // SmartDashboard Buttons
        SmartDashboard.putData("ClimbUp", new ClimbUp());
        SmartDashboard.putData("ClimbDown", new ClimbDown());
        SmartDashboard.putData("Shift", new Shift());
        SmartDashboard.putData("Throw", new Throw());
        SmartDashboard.putData("Retract", new Retract());
        SmartDashboard.putData("Auto1", new Auto1());
        SmartDashboard.putData("UserDrive", new UserDrive());
        SmartDashboard.putData("DriveToLine", new DriveToLine());
        SmartDashboard.putData("Rotate: 45posdeg", new Rotate(45));
        SmartDashboard.putData("Rotate: 30posdeg", new Rotate(30));
        SmartDashboard.putData("Rotate: 15posdeg", new Rotate(15));
        SmartDashboard.putData("Rotate: 5posdeg", new Rotate(5));
        SmartDashboard.putData("Rotate: 45negdeg", new Rotate(-45));
        SmartDashboard.putData("Rotate: 30negdeg", new Rotate(-30));
        SmartDashboard.putData("Rotate: 15negdeg", new Rotate(-15));
        SmartDashboard.putData("Rotate: 5negdeg", new Rotate(-5));
        SmartDashboard.putData("Auto2", new Auto2());
        SmartDashboard.putData("Auto3", new Auto3());
        SmartDashboard.putData("Auto4", new Auto4());
        SmartDashboard.putData("Auto5", new Auto5());
        SmartDashboard.putData("DrivePastLine: driveZero", new DrivePastLine(0));
        SmartDashboard.putData("shiftHigh", new shiftHigh());
        SmartDashboard.putData("shiftLow", new shiftLow());
        SmartDashboard.putData("ShooterSpinWheels", new ShooterSpinWheels());
        SmartDashboard.putData("CollectorRunWheelsIn", new CollectorRunWheelsIn());
        SmartDashboard.putData("CollectorActuate", new CollectorActuate());
        SmartDashboard.putData("AutoShoot", new AutoShoot());
        SmartDashboard.putData("CollectorRetract", new CollectorRetract());
        SmartDashboard.putData("CollectorExtend", new CollectorExtend());
        SmartDashboard.putData("CollectorStage", new CollectorStage());
        SmartDashboard.putData("CollectorRunWheelsOut", new CollectorRunWheelsOut());
        SmartDashboard.putData("ShootRaiseWheels", new ShootRaiseWheels());
        SmartDashboard.putData("ShooterLowerWheels", new ShooterLowerWheels());
        SmartDashboard.putData("RunCompressor: off", new RunCompressor(false));
        SmartDashboard.putData("RunCompressor: on", new RunCompressor(true));

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveJS() {
        return driveJS;
    }

    public Joystick getUtilJS() {
        return utilJS;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}


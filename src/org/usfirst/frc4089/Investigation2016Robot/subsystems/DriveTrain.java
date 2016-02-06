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
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final DoubleSolenoid leftDriveShifter = RobotMap.driveTrainLeftDriveShifter;
    private final DoubleSolenoid rightDriveShifter = RobotMap.driveTrainRightDriveShifter;
    private final DigitalInput leftLinePseudoLimit = RobotMap.driveTrainLeftLinePseudoLimit;
    private final DigitalInput rightLinePseudoLimit = RobotMap.driveTrainRightLinePseudoLimit;
    private final CANTalon mDrive1 = RobotMap.driveTrainMDrive1;
    private final CANTalon mDrive2 = RobotMap.driveTrainMDrive2;
    private final CANTalon mDrive3 = RobotMap.driveTrainMDrive3;
    private final CANTalon mDrive4 = RobotMap.driveTrainMDrive4;
    private final RobotDrive rDrive = RobotMap.driveTrainRDrive;
    private final Encoder quadEncoderLeft = RobotMap.driveTrainQuadEncoderLeft;
    private final Encoder quadEncoderRight = RobotMap.driveTrainQuadEncoderRight;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new UserDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void operatorControlFW(Joystick joystick1, Joystick joystick2){
    	rDrive.tankDrive(joystick1, joystick2);
    }
    
    public void operatorControlBW(Joystick joystick1, Joystick joystick2){
    	rDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    	rDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    	rDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
    	rDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
    	rDrive.tankDrive(joystick1, joystick2);
    }
    
  //specific drive directions for autonomous
    public void driveBackward(double speed){
    	rDrive.tankDrive(-speed, -speed);
    }
    
    public void driveBackwardDiff(double leftSpeed, double rightSpeed){
    	rDrive.tankDrive(-leftSpeed, -rightSpeed);
    }
    
    public void driveForward(double speed){
    	rDrive.tankDrive(speed,speed);
    }
    
    public void driveForwardDiff(double leftSpeed, double rightSpeed){
    	rDrive.tankDrive(leftSpeed, rightSpeed);
    }
    
    public void driveRight(double speed){
    	rDrive.tankDrive(-speed, speed);
    }
    
    public void driveRSightDiff(double leftSpeed, double rightSpeed){
    	rDrive.tankDrive(-leftSpeed, rightSpeed);
    }
    //
    public void driveLeft(double speed){
    	rDrive.tankDrive(speed, -speed);
    }
    
    public void driveLeftDiff(double leftSpeed, double rightSpeed){
    	rDrive.tankDrive(leftSpeed, -rightSpeed);
    }
    
    public void driveStop(){
    	rDrive.tankDrive(0,0);
    }
    //
    public boolean getDriveState(){
    	return false;
    }
 // calls the values of the encoders
    public double getLefRighttEncoderDist(){
    	return quadEncoderRight.getDistance();
    }
    public double getLeftEncoderDist(){
    	return quadEncoderLeft.getDistance();
    }
    public double getRightEncoderRate(){
    	return quadEncoderRight.getRate();
    }
    public double getLeftEncoderRate(){
    	return quadEncoderLeft.getRate();
    }
    
    public void leftShiftHigh(){
    	leftDriveShifter.set(DoubleSolenoid.Value.kForward);
    }
    public void leftShiftLow(){
    	leftDriveShifter.set(DoubleSolenoid.Value.kReverse);
    }
    public void leftShiftStop(){
    	leftDriveShifter.set(DoubleSolenoid.Value.kOff);
    }
    public void rightShiftHigh(){
    	rightDriveShifter.set(DoubleSolenoid.Value.kForward);
    }
    public void rightShiftLow(){
    	rightDriveShifter.set(DoubleSolenoid.Value.kReverse);
    }
    public void rightSiftStop(){
    	rightDriveShifter.set(DoubleSolenoid.Value.kOff);
    }
}


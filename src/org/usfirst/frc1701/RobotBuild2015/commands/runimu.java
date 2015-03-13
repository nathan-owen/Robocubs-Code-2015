// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1701.RobotBuild2015.commands;


import org.usfirst.frc1701.RobotBuild2015.Robot;
import org.usfirst.frc1701.RobotBuild2015.RobotMap;

import com.kauailabs.nav6.frc.IMUAdvanced;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class  runimu extends Command {
	
    public runimu() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.sensors);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	byte[] buffer = new byte[1];
//    	RobotMap.navx.read(0x09, 1, buffer);
//    	boolean is_calibrating = buffer[0] == 0x02;
        if ( RobotMap.first_iteration && !RobotMap.imu.isCalibrating() ) {
//        	RobotMap.navx.write(0x16, 0);
//        	RobotMap.navx.write(0x17, 0);
        	RobotMap.imu.zeroYaw();
            RobotMap.first_iteration = false;
        }
        
        // Update the dashboard with status and orientation
        // data from the nav6 IMU
//        buffer = new byte[2];
//        RobotMap.navx.read(0x16, 2, buffer);
//        int hundrethsofdegrees = ((buffer[0] & 0xFF) << 8)+ (buffer[1] & 0xFF);
        
//        buffer = new byte[1];
//        RobotMap.navx.read(0x08, 1, buffer);
//        boolean connected = buffer[0] != 0;
        
        SmartDashboard.putBoolean(  "IMU_Connected",        RobotMap.imu.isConnected());
        SmartDashboard.putNumber(   "IMU_Yaw",             RobotMap.imu.getYaw() );
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

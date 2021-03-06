// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1701.RobotBuild2015;

import org.usfirst.frc1701.RobotBuild2015.commands.DriveToStep;
import org.usfirst.frc1701.RobotBuild2015.commands.Resetimu;
import org.usfirst.frc1701.RobotBuild2015.commands.Rotateto180;
import org.usfirst.frc1701.RobotBuild2015.commands.Rotateto270;
import org.usfirst.frc1701.RobotBuild2015.commands.Rotateto360;
import org.usfirst.frc1701.RobotBuild2015.commands.Rotateto90;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


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
    public Joystick driveJoystick;
    public Joystick stick2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        stick2 = new Joystick(1);
        
        driveJoystick = new Joystick(0);
        

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("DriveToStep", new DriveToStep());

        SmartDashboard.putData("Reset imu", new Resetimu());

        SmartDashboard.putData("Rotate to 90", new Rotateto90());

        SmartDashboard.putData("Rotate to 180", new Rotateto180());

        SmartDashboard.putData("Rotate to 270", new Rotateto270());

        SmartDashboard.putData("Rotate to 360", new Rotateto360());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriveJoystick() {
        return driveJoystick;
    }

    public Joystick getStick2() {
        return stick2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}


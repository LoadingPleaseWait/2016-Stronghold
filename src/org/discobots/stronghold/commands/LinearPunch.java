package org.discobots.stronghold.commands;


import org.discobots.stronghold.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LinearPunch extends Command {

    public LinearPunch() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.linearPunchSub);
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//check position (once optical is ready)
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() { 
    	Robot.linearPunchSub.pull();
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
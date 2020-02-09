/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.SpeedControllerGroup;


public class Drive extends CommandBase {
  /**
   * Creates a new Drive.
   */
  public Drive() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftStickY = RobotContainer.schtick.getRawAxis(RobotContainer.LEFT_STICK_Y) *-1;
    double leftStickX = RobotContainer.schtick.getRawAxis(RobotContainer.LEFT_STICK_X);
    DifferentialDrive go = new DifferentialDrive(Robot.drivetrain.left,Robot.drivetrain.right);
    go.arcadeDrive(leftStickY, leftStickX);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

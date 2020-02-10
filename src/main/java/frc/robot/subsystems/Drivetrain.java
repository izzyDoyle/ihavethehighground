/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class Drivetrain extends SubsystemBase {
  /*
   * Creates a new Drivetrain.
   */
  SpeedController frontLeft = new WPI_VictorSPX(RobotContainer.FRONT_LEFT);
  SpeedController frontRight = new WPI_VictorSPX(RobotContainer.FRONT_RIGHT);
  SpeedController backLeft = new WPI_VictorSPX(RobotContainer.BACK_LEFT);
  SpeedController backRight = new WPI_VictorSPX(RobotContainer.BACK_RIGHT);
  public SpeedControllerGroup left = new SpeedControllerGroup(frontLeft, backLeft);
  public SpeedControllerGroup right = new SpeedControllerGroup(frontRight,backRight);
  public Drivetrain() {
  }
public void setLeftMotors(double speed){
  frontLeft.set(speed);
  backLeft.set(speed);
}
public void setRightMotors(double speed){
  frontRight.set(speed);
  backRight.set(speed);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

package org.frc6423.robot;

import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.epilogue.Epilogue;
import edu.wpi.first.epilogue.logging.ClassSpecificLogger;
import edu.wpi.first.epilogue.logging.EpilogueBackend;

public class RobotLogger extends ClassSpecificLogger<Robot> {
  public RobotLogger() {
    super(Robot.class);
  }

  @Override
  public void update(EpilogueBackend backend, Robot object) {
  }
}

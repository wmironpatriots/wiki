package org.frc6423.lib.driver;

import edu.wpi.first.epilogue.Logged;
import edu.wpi.first.epilogue.Epilogue;
import edu.wpi.first.epilogue.logging.ClassSpecificLogger;
import edu.wpi.first.epilogue.logging.EpilogueBackend;

public class MotorSubsystemLogger extends ClassSpecificLogger<MotorSubsystem> {
  public MotorSubsystemLogger() {
    super(MotorSubsystem.class);
  }

  @Override
  public void update(EpilogueBackend backend, MotorSubsystem object) {
    if (Epilogue.shouldLog(Logged.Importance.DEBUG)) {
      logSendable(backend.getNested("leader"), object.leader);
    }
  }
}

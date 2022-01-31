package frc.robot;

public final class Constants {
    public static final class Turret {
        public static final class Ports {
            // bully electrical to get these
            public static final int yawMotor = 0;
            public static final int pitchMotor = 0;
            public static final int flywheelMotorA = 0;
            public static final int flywheelMotorB = 0;
            public static final int yawLimitSwitch = 0;
            public static final int pitchLimitSwitch = 0;
        }

        public static final class TunedCoefficients {
            public static final class PitchPID {
                public static final double p = 0.00;
                public static final double i = 0.00;
                public static final double d = 0.00;
            }

            public static final class FlywheelPID {
                public static final double p = 0.00;
                public static final double i = 0.00;
                public static final double d = 0.00;
            }
        }
    }
}
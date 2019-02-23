package org.firstinspires.ftc.teamcode.qualifier;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "testservo", group = "Tests")
public class TestServo extends LinearOpMode
{

    //Creating a Rover robot object
    RoverRobot roverRuckusBot = new RoverRobot();

    private ElapsedTime runtime = new ElapsedTime();


    @Override
    public void runOpMode()
    {
        roverRuckusBot.initRobot(hardwareMap);

        while (!opModeIsActive() && !isStopRequested())
        {
            telemetry.addData("status", "waiting for start command...");
            telemetry.update();
        }

        while (opModeIsActive())
        {
            boolean ten = gamepad1.x;
            boolean twenty = gamepad1.y;
            boolean thirty = gamepad1.a;
            boolean forty = gamepad1.b;
            boolean fifty = gamepad1.dpad_up;
            boolean sixty = gamepad1.dpad_right;
            boolean seventy = gamepad1.dpad_down;
            boolean eighty = gamepad1.dpad_left;

            if(ten)
            {
                roverRuckusBot.getArmAssembly().flip(0.1);
            }
            else if(twenty)
            {
                roverRuckusBot.getArmAssembly().flip(0.2);
            }
            else if(thirty)
            {
                roverRuckusBot.getArmAssembly().flip(0.3);
            }
            else if(forty)
            {
                roverRuckusBot.getArmAssembly().flip(0.4);
            }
            else if(fifty)
            {
                roverRuckusBot.getArmAssembly().flip(0.5);
            }
            else if(sixty)
            {
                roverRuckusBot.getArmAssembly().flip(0.6);
            }
            else if(seventy)
            {
                roverRuckusBot.getArmAssembly().flip(0.7);
            }
            else if(eighty)
            {
                roverRuckusBot.getArmAssembly().flip(0.8);
            }
        }
    }
}
package org.firstinspires.ftc.teamcode.fotr;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.ftc16072.QQ_ActionDriveTo;
import org.firstinspires.ftc.teamcode.ftc16072.QQ_ActionSetPosition;
import org.firstinspires.ftc.teamcode.ftc16072.QQ_AutoAction;
import org.firstinspires.ftc.teamcode.ftc16072.QQ_AutoBase;
import org.firstinspires.ftc.teamcode.ftc16072.Util.RobotPosition;

import java.util.Arrays;
import java.util.List;

@Autonomous(name = "Red Right: 1", group = "FoTR")
public class AutoRedRight1 extends QQ_AutoBase {
    @Override
    public List<QQ_AutoAction> getSteps() {
        return Arrays.asList(
                new QQ_ActionSetPosition(new RobotPosition(0, 0, DistanceUnit.INCH, 0, AngleUnit.DEGREES)),
                new QQ_ActionDriveTo(0, -14, DistanceUnit.INCH),
                new QQ_ActionDriveTo(80, -14, DistanceUnit.INCH),
                new QQ_ActionDriveTo(80, 14, DistanceUnit.INCH),    // to Drop Zone B: drop off wobble goal
                new QQ_ActionDriveTo(63, 14, DistanceUnit.INCH),    // to Launch Line: fire 3 rings
                new QQ_ActionDriveTo(50, 14, DistanceUnit.INCH),    // to Starter Spot: pick up one ring
                new QQ_ActionDriveTo(63, 14, DistanceUnit.INCH),    // to Launch Line: fire 1 ring
                new QQ_ActionDriveTo(3, 14, DistanceUnit.INCH),     // to 2nd wobble goal: pick up wobble goal
                new QQ_ActionDriveTo(80, 14, DistanceUnit.INCH));   // to Drop Zone B: drop off 2nd wobble goal, park
    }
}

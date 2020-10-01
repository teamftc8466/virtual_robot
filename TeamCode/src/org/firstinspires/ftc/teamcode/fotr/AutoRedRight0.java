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

@Autonomous(name = "Red Right: 0", group = "FoTR")
public class AutoRedRight0 extends QQ_AutoBase {
    @Override
    public List<QQ_AutoAction> getSteps() {
        return Arrays.asList(
                new QQ_ActionSetPosition(new RobotPosition(0, 0, DistanceUnit.INCH, 0, AngleUnit.DEGREES)), // start location
//                new QQ_ActionDriveTo(0, 9, DistanceUnit.INCH),
                new QQ_ActionDriveTo(74, 0, DistanceUnit.INCH),   //to Drop Zone A: drop off 1st wobble goal
                new QQ_ActionDriveTo(74, 14, DistanceUnit.INCH),
                new QQ_ActionDriveTo(63, 14, DistanceUnit.INCH),    //to Launch line: fire 3 rings
                new QQ_ActionDriveTo(3, 14, DistanceUnit.INCH),     //back to 2nd wobble goal: pick up
                new QQ_ActionDriveTo(74, 14, DistanceUnit.INCH),
                new QQ_ActionDriveTo(74, 8, DistanceUnit.INCH));    //back to Drop Zone A: drop off 2nd wobble goal, park.
    }
}

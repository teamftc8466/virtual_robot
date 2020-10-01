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

@Autonomous(name = "Red Right: 4", group = "FoTR")
public class AutoRedRight4 extends QQ_AutoBase {
    @Override
    public List<QQ_AutoAction> getSteps() {
        return Arrays.asList(
                new QQ_ActionSetPosition(new RobotPosition(0, 0, DistanceUnit.INCH, 0, AngleUnit.DEGREES)),
                new QQ_ActionDriveTo(0, -14, DistanceUnit.INCH),
                new QQ_ActionDriveTo(54, -14, DistanceUnit.INCH),
                new QQ_ActionDriveTo(54, 14, DistanceUnit.INCH),
                new QQ_ActionDriveTo(66, 14, DistanceUnit.INCH),
                new QQ_ActionDriveTo(3, 14, DistanceUnit.INCH),
        new QQ_ActionDriveTo(74, 14, DistanceUnit.INCH),
                new QQ_ActionDriveTo(74, 8, DistanceUnit.INCH));
    }
}

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="MonsieurMallahBeanDance", group="AAAAAAAAAAAAAAAAAAAAAA")
public class MonsieurMallahBeanDance extends BeanDance {
    public MonsieurMallahBeanDance() {
        super(ChassisConfig.forMonsieurMallah());
    }
}
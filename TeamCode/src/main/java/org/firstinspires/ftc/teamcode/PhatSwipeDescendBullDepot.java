package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Phat; DescendBullDepot", group="BPhatSwipe")
public class PhatSwipeDescendBullDepot extends DescendBullDepot {
    public PhatSwipeDescendBullDepot() {
        super(ChassisConfig.forPhatSwipe());
    }
}
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Quick; RetroLandBullRunDepot", group="MonsieurMallah")
public class QuicksilverChaChaCha extends BullRunChaChaCha {
    public QuicksilverChaChaCha() {
        super(ChassisConfig.forQuickSilver());
    }
}
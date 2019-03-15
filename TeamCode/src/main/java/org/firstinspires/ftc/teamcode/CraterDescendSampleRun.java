package org.firstinspires.ftc.teamcode;

/**
 *  This is from the position closest to the crater.
 */
public abstract class CraterDescendSampleRun extends StandardChassis {

    private boolean madeTheRun = false;
    private GoldStatus pos = GoldStatus.Unknown;
    private long delay;


    public CraterDescendSampleRun(ChassisConfig config, long delay) {
        super(config);
        this.delay = delay;
    }

    /**
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        initMotors();
        initTimeouts();
        initSampling();
        initGyroscope();
    }



    /**
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop () {
    }

    /**
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start () {
        // Reset the game timer.
        runtime.reset();
    }

    /**
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop () {
        stopSampling();
    }

    /**
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop () {

        if (madeTheRun == false) {

            pos = loopSampling();

            boolean goBackDown = (delay > 0);

            descendFromLander(goBackDown);

            if (pos == GoldStatus.Unknown)
                pos = sampleProbe();

            sleep(delay);

            craterSampleRun(pos);

            madeTheRun = true;

        }

        // Show the elapsed game time and wheel power.
        telemetry.addData("Status", "Pos: " + pos.toString());
        telemetry.addData("Status", "time: " + runtime.toString());
        telemetry.addData("Status", "madeTheRun=%b", madeTheRun);
    }
}
package com.company;

public class CrossStitchWigglePattern extends Pattern {

    @Override
    public void pattern() {
        SmallCrossStitch scs = new SmallCrossStitch();
        LargeCrossStitch stitch2 = new LargeCrossStitch();
        scs.sew(); // do it like this to start with to prove I can do it.
        stitch2.sew();
        scs.sew();
        stitch2.sew();
        scs.sew();
        stitch2.sew();
        scs.sew();
        stitch2.sew();
        scs.sew();
        stitch2.sew();
        //System.out.println(" ");
        System.out.print(" ");



        //System.out.println("xXxXxXxXxX");

    }
}

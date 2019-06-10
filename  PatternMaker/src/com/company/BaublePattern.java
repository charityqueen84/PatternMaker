package com.company;

public class BaublePattern extends Pattern {

    @Override
    public void pattern() {
        ShortLineStitch sls = new ShortLineStitch();
        CircleStitch cs = new CircleStitch();
        sls.sew();
        sls.sew();
        cs.sew();
        sls.sew();
        sls.sew();
        cs.sew();
        sls.sew();
        sls.sew();
        cs.sew();
        sls.sew();
        sls.sew();
        cs.sew();
        sls.sew();
        sls.sew();
        cs.sew();
        System.out.print(" ");

        //System.out.println("--o--o--o--o--o");
    }
}

package com.company;

public class BlockyBaublePattern extends Pattern {

    @Override
    public void pattern() {
        BlockStitch bs = new BlockStitch();
        ShortLineStitch sls = new ShortLineStitch();
        CircleStitch cs = new CircleStitch();
        bs.sew();
        sls.sew();
        sls.sew();
        cs.sew();
        sls.sew();
        sls.sew();
        bs.sew();
        sls.sew();
        sls.sew();
        cs.sew();
        sls.sew();
        sls.sew();
        bs.sew();
        sls.sew();
        sls.sew();
        cs.sew();
        sls.sew();
        sls.sew();
        System.out.print(" ");





        //System.out.println("[]--o--[]--o--[]--o--");
    }
}

package com.company;

public class ZigZagLinesPattern extends Pattern {

    @Override
    public void pattern() {
        ZigZagStitch zzp = new ZigZagStitch();
        FillStitch zzp2 = new FillStitch();
        zzp.sew();
        zzp.sew();
        zzp.sew();
        zzp2.sew();
        zzp2.sew();
        zzp2.sew();
        zzp.sew();
        zzp.sew();
        zzp.sew();
        zzp2.sew();
        zzp2.sew();
        zzp2.sew();
        System.out.print(" ");





        //System.out.println("ZZZ===ZZZ===");
    }
}

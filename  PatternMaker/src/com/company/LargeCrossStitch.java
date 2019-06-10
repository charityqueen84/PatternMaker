package com.company;

public class LargeCrossStitch extends Stitch {

    @Override
    public void sew() {
        System.out.print("X"); //take out ln on all stitches so it won't skip to next line
    }
}

package org.launchcode.studio7;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class CD extends BaseDisc implements OpticalDisc, Writable{

    public CD(String name, float capacity, String type, boolean reWritable) {
        super(name, capacity, type, reWritable);
        this.storeData();
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void writeToDisc() {

    }

    @Override
    public void readFromDisc() {

    }

    @Override
    public void storeData() {
        if (this.isReWritable()) {
            ArrayList content;
            System.out.println("ArrayList");
        } else {
            HashMap<Integer, String> content;
            System.out.println("HashMap");
        }
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
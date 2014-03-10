/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author drew
 */
public class ServoModel {
    
    private int min, max;
    private double current;
    private String name;
    private int index;
    public ServoModel() {
        min = -180;
        max = 180;
    }
    public ServoModel(int min, int max, String name) {
        this.min = min;
        this.max = max;
        this.current = min;
        this.name = name;
    }
    
    public void setCurrent(int val) {
        this.current = val;
    }
    
    public int getCurrent() {
        return (int)current;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}

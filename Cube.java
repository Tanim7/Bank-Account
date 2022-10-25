/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author ASUS
 */
public class Cube {
    public float length;
    public float waterVolume;

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public float getWaterVolume() {
        return waterVolume;
    }
    public void addWater(double amount){
        if (amount > 0 && amount <= ((length*length*length)-waterVolume)) {
            waterVolume+=amount;
           
        }
        
    }
    
}

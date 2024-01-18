/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrLinxed
 */
public class Timer {
    private ClockHand hunderths = new ClockHand(100);
    private ClockHand seconds = new ClockHand(60);
    
    public void advance() {
        this.hunderths.advance();
        if(this.hunderths.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return this.seconds + ":" + this.hunderths;
    }
}

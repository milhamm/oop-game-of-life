package gameoflife.core;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faisal
 */
public interface CellBehaviour {
        boolean isAlive();
        void kill();
        void revive();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Test;

import MavenSample.Add;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Peer.Mohamed
 */
public class TestAdd {

    @Test
    public void sample() {
        Add a = new Add();
        Assertions.assertEquals(4, a.sum(2, 2));
        
    }


}

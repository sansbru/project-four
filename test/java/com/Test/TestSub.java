/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Test;

import MavenSample.Add;
import MavenSample.Sub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Peer.Mohamed
 */
public class TestSub {
    
    @Test
    public void check() {
        Sub b = new Sub();
        Assertions.assertEquals(4, b.minus(2, 2));
}
}

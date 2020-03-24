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
public class TestTwo {

    @Test
    public void check() {
        Add m = new Add();

        Assertions.assertEquals(3, m.sum(2, 2));
    }
}

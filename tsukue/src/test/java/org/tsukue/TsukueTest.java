package org.tsukue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TsukueTest {
    @Nested
    class DeskTest{
        @Test
        void StandingDeskが構築されること(){
            assertEquals("DESK Building! pillar=Pillar{material=Wood, shape=Square, width=10.7, height=20.8, depth=30.9, number=1}, topBoard=TopBoard{material=Wood, shape=Circle, width=40.7, height=50.8, depth=60.9}", TsukueFactory.createStandingDesk().build());
        }
    }
    @Nested
    class TableTest{
        @Test
        void Tableが構築されること(){
            assertEquals("Table Building!", TsukueFactory.createTable().build());
        }
    }


}
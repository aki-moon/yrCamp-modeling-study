package org;

import org.building.TsukueFactory;
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

        @Test
        void WorkingDeskが構築されること(){
            assertEquals("DESK Building! pillar=Pillar{material=Wood, shape=Square, width=10.7, height=20.8, depth=30.9, number=1}, topBoard=TopBoard{material=Wood, shape=Circle, width=40.7, height=50.8, depth=60.9}, drawer=Drawer{material=Wood, shape=Square, width=70.7, height=80.8, depth=90.9, num=10}", TsukueFactory.createWorkingDesk().build());
        }
    }
    @Nested
    class TableTest{
        void StandingTableが構築されること(){
            assertEquals("DESK Building! pillar=Pillar{material=Wood, shape=Square, width=10.7, height=20.8, depth=30.9, number=1}, topBoard=TopBoard{material=Wood, shape=Circle, width=40.7, height=50.8, depth=60.9}", TsukueFactory.createWorkingTable().build());
        }
        @Test
        void WorkingTableが構築されること(){
            assertEquals("TABLE Building! pillar=Pillar{material=Wood, shape=Square, width=10.7, height=20.8, depth=30.9, number=1}, topBoard=TopBoard{material=Wood, shape=Circle, width=40.7, height=50.8, depth=60.9}, drawer=Drawer{material=Wood, shape=Square, width=70.7, height=80.8, depth=90.9, num=10}", TsukueFactory.createWorkingTable().build());
        }
    }


}
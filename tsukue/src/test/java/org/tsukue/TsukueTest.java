package org.tsukue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TsukueTest {
    @Nested
    class DeskTest{
        @Test
        void Deskが構築されること(){
            assertEquals("Desk Building!", TsukueFactory.createDesk().build());
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
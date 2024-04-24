import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoteControllerTest {
    @Nested
    class エアコンのONとOFFの切り替え {
        RemoteController remoteController;
        @Test
        void 電源をつけるとエアコンが動作する() {
            remoteController.start(new HeatingHygrothermalControl(), 24);
            assertEquals(Condition.ON, remoteController.condition());
        }
        @Test
         void 電源を消すとエアコンが停止する() {
            remoteController.stop();
            assertEquals(Condition.OFF, remoteController.condition());
        }
        @Test
        void デフォルト状態だと電源はOFF() {
            assertEquals(Condition.OFF, remoteController.condition());
        }

        @BeforeEach
        void setUp() {
            remoteController = new RemoteController();
        }
    }

    @Nested
    class 暖房運転 {
        RemoteController remoteController;
        @Test
        void 室温24度の時に暖房28度にすると室温が28度になる() {
            remoteController.start(new HeatingHygrothermalControl(), 28);
            assertEquals(28.0, remoteController.indoorTemperature());
        }
        @Test
        void 室温24度の時に暖房22度にすると室温が24度になる() {
            remoteController.start(new HeatingHygrothermalControl(), 22);
            assertEquals(24.0, remoteController.indoorTemperature());
        }
        @BeforeEach
        void setUp() {
            remoteController = new RemoteController();
        }
    }
    @Nested
    class 冷房運転 {
        RemoteController remoteController;
        @Test
        void 室温24度の時に冷房26度にすると室温が24度になる() {
            remoteController.start(new CoolingHygrothermalControl(), 26);
            assertEquals(24.0, remoteController.indoorTemperature());
        }
        @Test
        void 室温24度の時に冷房22度にすると室温が22度になる() {
            remoteController.start(new CoolingHygrothermalControl(), 22);
            assertEquals(22.0, remoteController.indoorTemperature());
        }
        @BeforeEach
        void setUp() {
            remoteController = new RemoteController();
        }
    }
}
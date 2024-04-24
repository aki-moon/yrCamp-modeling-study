import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoteControllerTest {
    @Nested
    class エアコンのONとOFFの切り替えができるのか確認 {
        RemoteController remoteController;
        @Test
        void 電源をつけるとエアコンが動作する() {
            remoteController.start();
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
}

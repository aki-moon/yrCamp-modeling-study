package org;

import java.util.ArrayList;
import java.util.List;

public class GuestBook {
        private static GuestBook guestBook;
        private static final List<String> gloomNameList = new ArrayList<>();
        private static final List<String> brideNameList = new ArrayList<>();
        private GuestBook() {}

        public static synchronized GuestBook getInstance() {
            if (guestBook == null) {
                guestBook = new GuestBook();
            }
            return guestBook;
        }

        public static void printName(String name, NewlyWedsType newlyWedsType){
            if(newlyWedsType == NewlyWedsType.GROOM) {
                gloomNameList.add(name);
                return;
            }
            brideNameList.add(name);
        }

        public static boolean isParticipate(String name, NewlyWedsType newlyWedsType){
            if (newlyWedsType == NewlyWedsType.GROOM) {
                return gloomNameList.contains(name);
            }
            return brideNameList.contains(name);
        }
}

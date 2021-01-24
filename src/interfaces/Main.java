package interfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        /** The important thing about this example is that it uses List whenever possible
         and avoids specifying LinkedList or ArrayList unless it is necessary. */
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);

        /** If you change your mind and decide to use an ArrayList, you only have to change the constructor;
         * of ListClientExample class, you don’t have to make any other changes. */

        // This style is called interface-based programming, or more casually, “programming to an interface".
        
    }
}

package com.java.demo.ArrayListTest;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("001", "包子", "123");
        User user2 = new User("002", "朱朱", "456");
        User user3 = new User("003", "婷婷", "789");
        users.add(user1);
        users.add(user2);
        users.add(user3);

        int hasIndex = getUser(users, "002");
        System.out.println("存在对象的索引为" + hasIndex);
    }

    public static int getUser(ArrayList<User> userList, String id) {
        for (int i = 0; i < userList.size(); i++) {
            User u = userList.get(i);
            if (u.getId() == id) {
                return i;
            }
        }
        return -1;
    }
}

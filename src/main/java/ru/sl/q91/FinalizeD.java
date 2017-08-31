package ru.sl.q91;

public class FinalizeD {
    public static void main(String[] args) {
        User user=new User(1);
        user=null;

        User user1=new User(2);
//        Object o=user1;
        Object o=new User(3);
        user1=user;
        System.gc();
    }
}
class User{
    private int id;

    public User(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println(id);
        } finally {
            super.finalize();
        }
    }
}

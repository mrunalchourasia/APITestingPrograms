package TestNgExample;

import org.testng.annotations.Test;

public class PriorityTC {
    @Test(priority=2)

    public void test_tc1(){
        System.out.println("1 sanity");
    }
    @Test(priority=1)

    public void test_tc2() {
        System.out.println("2 Smoke");
    }

        @Test(priority=3)

        public void test_tc3 () {
            System.out.println("1 Reg");
        }
    }
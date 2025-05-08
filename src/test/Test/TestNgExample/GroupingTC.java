package TestNgExample;

import org.testng.annotations.Test;

public class GroupingTC {

        @Test(groups={"sanity"})

        public void test_tc1(){
            System.out.println("1 sanity");
        }
        @Test(groups={"smoke"})

        public void test_tc2() {
            System.out.println("2 Smoke");
        }

        @Test(groups={"reg"})

        public void test_tc3 () {
            System.out.println("1 Reg");
        }
    }


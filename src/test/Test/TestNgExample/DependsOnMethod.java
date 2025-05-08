package TestNgExample;

import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void StartServerFirst(){
        System.out.println("I will start first");
    }
    @Test(dependsOnMethods ="StartServerFirst")
    public void test1(){
        System.out.println("test1 start");
    }
    @Test(dependsOnMethods ="StartServerFirst")
    public void test2() {
        System.out.println("test2 start");
    }}

package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;                     // static 메소드에는 static 필드만 사용 가능

    /*설명. 기본 생성자 및 getter*/

    public StaticFieldTest() {

    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public void setNonStaticCount(int nonStaticCount) {
        this.nonStaticCount = nonStaticCount;
    }

    public static void setStaticCount(int staticCount) {
        StaticFieldTest.staticCount = staticCount;
    }

    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public static void increaseStaticCount() {
        StaticFieldTest.staticCount++;
        staticCount++;
    }
}

package com.ohgiraffers.section04.dto;

import java.util.Date;

/*필기.
*  자바 빈(JAVA Bean): JSP에서 표준 액션 태그로 접근할 수 있게 만든 자바 클래스
*                     자바 코드를 모르는 웹 퍼블리셔도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을 의미
*                     이 경우에 사용할 수 있도록 규칙을 미리 지정해놓은 java 클래스가 자바 빈(java bean)
*                     특정 목적에 따라 클래스를 작성하는 규칙*/

/*필기.
*  자바 빈 작성 규칙
*   1. 자바 빈은 특정 패키지에 속해 있어야 한다.(default 패키지 사용 X)
*   2. 필드의 접근 제어자는 private로 선언
*   3. 기본 생성자가 명시적으로 존재(매개변수 있는 생성자는 선택사항)
*   4. 모든 필드에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성
*   5. 직렬화(Serializable)를 고려(선택사항)
* */

/*필기. Data Transfer Object*/

public class UserDTO {

    /*필기. 필드(멤버 변수)*/
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /*필기. 생성자(기본 생성자 명시적 작성 필수)*/
    public UserDTO() {
    }

    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    /*필기. 설정자(setter)와 접근자(getter)*/
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    /*설명. 단축키를 통해 setter와 getter 생성*/
    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

//    public String forInformation() {
//        return id + ", " + pwd + ", " + name + ", " + enrollDate;
//    }

    /*필기. 모든 멤버 변수를 String으로 반환하는 toString() 함수*/
    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}



mysql 8 미만
grant all privileges on restaurant.* to 'root'@'%' identified by 'root';
flush privileges;



-- mysql 8 이후

localhost - sql tool
% - web application
create user 'root'@'%' identified by 'root';
grant all privileges on restaurant.* to 'root'@'%' with grant option ;
flush privileges;



CREATE USER 'restaurant'@'%' IDENTIFIED BY 'root';
grant all privileges on restaurant.* to 'root'@'%' with grant option ;
flush privileges;



public key retrieval is not allowed
mysql 8.x 버전 이후로 발생
jdbc url에 allowPublicKeyRetrieval=true&useSSL=false 필요

<bean id="dataSourceSpied" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
    <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
    <property name="url" value="jdbc:mysql://localhost:3306/restaurant?allowPublicKeyRetrieval=true&amp;useSSL=false"/>
    <property name="username" value="root"/>
    <property name="password" value="root"/>
</bean>

   <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.11</version>
    </dependency>


방확벽설정 풀기
https://walkingfox.tistory.com/66



=====================================================================================================
menu_price 가 default 값이 정해지지 않았을 때

DB menu table 의 menu_price default 값을 0으로 한다.


DB 에서 불러온 내용을 순서대로 표시하기 :
    ex) order 테이블의 내용을 order_id 오름차순으로 정렬
    order by order_id ASC;


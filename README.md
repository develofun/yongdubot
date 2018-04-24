# yongdubot

매주 진행하는 풋살 모임 신청 인원 모집이나 일정 체크를 일일이 주최자 혹은 그 주변인이 채팅이나<br>
카카오 설문 기능으로 모집하는 게 번거롭다고 생각하여 봇으로 구현하면 좋을 것 같아 진행

### 개발 환경
- **Language** : Java 1.8
- **Server** : Springboot 2.0.1
- **Build** : Gradle
- **WAS** : Tomcat8.0
- **ORM** : JPA / Hibernate
- **DB** : MySQL 5.7
- **IDE** : STS
- **OS** : WIndow 7

로컬 환경에서 개발 및 테스트 후 네이버 클라우드 플랫폼에 구축된 인스턴스에 배포할 예정이며,
배포되는 환경은 아래와 같습니다.
- **OS** : Linux CentOS
- **WAS** : Tomcat
<br><br>

### Lombok 적용
JPA를 사용하면서 vo의 getter, setter, constructor 등을 간단하게 설정하기 위해<br>
Lombok을 적용하여 @Getter, @Setter, @NoArgConstructor 등의 어노테이션 이용
<br><br>

### Security는 잠시 접어두기..
Springboot 프로젝트 생성 시 security를 설정하면 자동으로 dependency가 추가되는데<br>
그대로 프로젝트를 실행하면 security 페이지가 나오면서 로그인이 안되면 다른 작업을 확인할 수 없다.<br>
**그렇게 작업할 순 없으니!!**
build.gradle에서 security 관련 dependency는 주석 처리하고 dependency refresh를 해주자.
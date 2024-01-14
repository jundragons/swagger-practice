# swagger-practice
- 스프링부트 프로젝트에 swagger 연동 practice
- Swagger 로컬 접속 URI : http://localhost:8080/swagger-ui/index.html

## 1. Swagger
***
```text
Swagger

개발자가 REST 웹 서비스를 설계, 빌드, 문서화, 소비하는 일을 도와주는 대형 도구 생태계의 지원을 받는 
오픈 소스 소프트웨어 프레임워크이다. 대부분의 사용자들은 스웨거 UI 도구를 통해 스웨거를 식별하며 
스웨거 툴셋에는 자동화된 문서화, 코드 생성, 테스트 케이스 생성 지원이 포함된다.
```
- 공식 사이트 및 개발 문서 : https://swagger.io/


### 1.1) Swagger Library
***
- **SpringFox** vs **SpringDoc**

swagger를 사용하기 위한 라이브러리로는 **Springfox**와 **Springdoc** 라이브러리가 있다.

**SpringFox** 먼저 시작되었으나, 업데이트가 2020년7월을 마지막으로 중단된 상태이다(2024년1월기준)

**SpringDoc** 꾸준히 업데이트를 하고 있으며, **api별 정렬 기능** 및 **webFlux** 대한 지원도 하고 있다

## 2. 환경 설정
### 2.1) 개발 환경
***

| 개발환경                 |            버전 |
|:---------------------|--------------:|
| java                 |           1.8 |
| Spring Boot          |         2.7.8 |
| IDE                  | Intellij IDEA |
| Swagger              |           1.0 |
| springdoc-openapi-ui  |         1.7.0 |


### 2.2) build.gradle
***
`의존성에 springdoc-openapi-ui 라이브러리 추가`

```groovy
depencies{
    implementation group: 'org.springdoc', name: 'springdoc-openapi-ui', version: '1.7.0'
}
```

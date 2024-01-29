package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 컴포넌트 스캔을 할 패키지 위치 지정 (해당 패키지를 기준으로 하위를 스캔함!)
        // basePackages를 생략하면, 현재 @ComponentScan이 붙은 Config 클래스의 패키지 위치가 기본값으로 들어감.
        basePackages = "hello.core", // {"hello.core", "hello.serivce"} 여러개 지정도 가능!
        // 기존 AppConfig를 제외하기 위해 넣은 코드 (예제코드를 살리기 위해)
        // basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    /*
    컴포넌트 스캔은 @Component 에노테이션이 붙은 모든 클래스를 찾아줌.

    컴포넌트 스캔의 대상
    @Component : 컴포넌트 스캔에서 사용
    @Controller : 스프링 MVC 컨트롤러에서 사용
    @Service : 스프링 비즈니스 로직에서 사용
    @Repository : 스프링 데이터 접근 계층에서 사용
    @Configuration : 스프링 설정 정보에서 사용

    또한, 다음 애노테이션이 있으면 스프링은 부가 기능을 한다.
    @Controller : 스프링 MVC 컨트롤러로 인식
    @Repository : 스프링 데이터 접근 계층으로 인식하고, 데이터 계층의 예외를 스프링 예외로 변환해준다.
    @Configuration : 앞서 보았듯이 스프링 설정 정보로 인식하고, 스프링 빈이 싱글톤을 유지하도록 추가 처리한다.
    @Service : 서비스는 특별한 처리를 하지 않는다. 대신, 개발자들이 핵심 비즈니스 로직이 여기에 있겠구나 라고 비즈니스 계층을 인식하는데 도움이 된다.
     */
}

package hello.hellospring.service;

//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospring.aop.TimeTraceAop;
//import hello.hellospring.repository.JdbcMemberRepository;
//import hello.hellospring.repository.JdbcTemplateMemberRepository;
//import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.MemberRepository;
//import hello.hellospring.repository.MemoryMemberRepository;
//import jakarta.persistence.EntityManager;

@Configuration
public class SpringConfig {


    private final MemberRepository memberRepository;


    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

/*     private EntityManager em;
    
    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    } */

/*     private DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    } */
    



    @Bean
    public MemberService memberService() {
        //return new MemberService(memberRepository());
        return new MemberService(memberRepository);
    }

/*     @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    } 이 방식은 TimeTraceAop를 @Bean으로 직접 빈을 등록 정의.
     지금은 @Component 방식으로 자동으로 등록함.
        */

/*     @Bean
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
        //return new JpaMemberRepository(em);
    } */
   
}

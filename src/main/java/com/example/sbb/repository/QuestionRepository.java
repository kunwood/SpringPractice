package com.example.sbb.repository;

import com.example.sbb.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : com.example.sbb.repository
 * fileName : QuestionRepository
 * author : geonu
 * date : 2023/08/04
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023/08/04         geonu          최초 생성
 */
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
}

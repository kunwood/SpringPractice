package com.example.sbb.repository;

import com.example.sbb.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : com.example.sbb.repository
 * fileName : AnswerRepository
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
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}

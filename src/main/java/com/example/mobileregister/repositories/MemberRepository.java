package com.example.mobileregister.repositories;

import com.example.mobileregister.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MemberRepository extends JpaRepository<Member, String>{
    public List<Member> findByReferececode(String Referencecode);
}

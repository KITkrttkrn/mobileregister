package com.example.mobileregister.services;

import com.example.mobileregister.models.Member;
import com.example.mobileregister.models.RegistrationRequest;
import com.example.mobileregister.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void addMember(RegistrationRequest registrationRequest) {

        Member member = new Member(registrationRequest.getFirstname(),
                                   registrationRequest.getLastname(),
                                   registrationRequest.getBirthdate(),
                                   registrationRequest.getTel(),
                                   genRefCode(registrationRequest.getBirthdate(),registrationRequest.getTel()),
                                   registrationRequest.getSalary());
        memberRepository.save(member);
    }

    public List<Member> findMember(String id) {
        return memberRepository.findByReferececode(id);
    }

    public List<Member> findAllMember() {
        return memberRepository.findAll();
    }

    public String getTypeClassify(Double salary){
        if(salary > 50000.00){
            return "Platinum";
        }else if (salary <= 50000.00 && salary >= 30000.00){
            return "Gold";
        }else if (salary < 30000.00 && salary >= 15000.00){
            return "Silver";
        }else {
            return "None";
        }
    }

    public String genRefCode(String birthdate, String tel){
        String tmpTel = tel.substring(6);
        String tmpBirthDate = birthdate.replace("-","");
        return tmpBirthDate+tmpTel;
    }
}

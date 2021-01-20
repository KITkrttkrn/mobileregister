package com.example.mobileregister.controller;

import com.example.mobileregister.models.*;
import com.example.mobileregister.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class registrationController {

    @Autowired
    MemberService memberService;


    @PostMapping("/registration")
    public ResponseEntity<?> registerMember(@RequestBody RegistrationRequest member) throws Exception {

        if(memberService.getTypeClassify(member.getSalary()).equalsIgnoreCase("None")){
            return ResponseEntity.ok(new RegistrationResponse("You can't be register"));
        }

        memberService.addMember(member);
        return ResponseEntity.ok(new AuthenticationResponse(memberService.getTypeClassify(member.getSalary())));
    }

    @GetMapping("/getmember/{refercode}")
    public ResponseEntity<?> getMember(@PathVariable String refercode) throws Exception {

        return ResponseEntity.ok(memberService.findMember(refercode));

    }

    @GetMapping("/getmember")
    public ResponseEntity<?> getMember() throws Exception {

        return ResponseEntity.ok(memberService.findAllMember());

    }
}

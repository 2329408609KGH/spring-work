package com.qfedu.kgh.controller;

import com.qfedu.kgh.common.request.SignInRequest;
import com.qfedu.kgh.common.result.RespResult;
import com.qfedu.kgh.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signin")
public class SignInController {
    @Autowired
    private SignInService signInService;

    /**
     * 签到
     * @param signInRequest
     * @return
     */
    @PostMapping("/sign")
    public RespResult<Integer> signIn(@RequestBody SignInRequest signInRequest){
        return signInService.singIn(signInRequest);
    }
}

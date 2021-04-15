package com.course.business.controller.admin;

import com.course.server.dto.PageDto;
import com.course.server.dto.ResponseDto;
import com.course.server.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/member")
public class MemberController {

    private static final Logger LOG = LoggerFactory.getLogger(MemberController.class);
    public static final String BUSINESS_NAME = "会员";

    @Resource
    private MemberService memberService;

    @PostMapping("/list")
    public ResponseDto list(@RequestBody PageDto pageDto) {
        LOG.info("pageDto:{}", pageDto);
        ResponseDto responseDto = new ResponseDto();
        memberService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

}

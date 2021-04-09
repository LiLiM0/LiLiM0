package com.course.file.controller.admin;

import com.course.server.dto.ResponseDto;
import com.course.server.util.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/admin")
@RestController
public class UploadController {

    private static final Logger LOG = LoggerFactory.getLogger(UploadController.class);

    public static final String BUSINESS_NAME = "文件上传";

    @Value("${file.domain}")
    private String FILE_DOMAIN;

//    @Value("${oss.domain}")
//    private String OSS_DOMAIN;

    @Value("${file.path}")
    private String FILE_PATH;

//    @Value("${vod.accessKeyId}")
//    private String accessKeyId;
//
//    @Value("${vod.accessKeySecret}")
//    private String accessKeySecret;

//    @Resource
//    private FileService fileService;

    @RequestMapping("/upload")
    public ResponseDto upload(@RequestParam MultipartFile file) throws IOException {
        LOG.info("上传图片开始：{}", file);
        LOG.info("图片名字：" + file.getOriginalFilename());
        LOG.info("图片大小：" + String.valueOf(file.getSize()) + "字节");

        //保存文件到本地
        String fileName = file.getOriginalFilename();
        String key = UuidUtil.getShortUuid();
        String fullPath = FILE_PATH + "teacher/" + key + "-" + fileName;
        File dest = new File(fullPath);
        file.transferTo(dest);
        LOG.info("图片路径：" + dest.getAbsolutePath());

        ResponseDto responseDto = new ResponseDto();
        responseDto.setContent(FILE_DOMAIN + "teacher/" + key + "-" + fileName);
        return responseDto;
    }
}

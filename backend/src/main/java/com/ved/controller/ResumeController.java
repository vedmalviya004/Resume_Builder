package com.ved.controller;

import com.ved.ResumeRequest;
import com.ved.services.ResumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/resume")
@RequiredArgsConstructor
public class ResumeController {

    private final ResumeService resumeService;

    @PostMapping("/generate")
    public ResponseEntity<Map<String, Object >> getResumeData(@RequestBody ResumeRequest resumeRequest)  {
        Map<String, Object > stringObjectMap = resumeService.generateResumeResponse(resumeRequest.userResumeDescription());
        return ResponseEntity.ok(stringObjectMap);
    }
}

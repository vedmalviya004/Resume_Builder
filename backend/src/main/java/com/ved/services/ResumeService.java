package com.ved.services;

import java.util.Map;

public interface ResumeService {
    Map<String, Object> generateResumeResponse(String userResumeDescription);
}

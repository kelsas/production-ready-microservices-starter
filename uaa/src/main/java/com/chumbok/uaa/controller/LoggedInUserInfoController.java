package com.chumbok.uaa.controller;

import com.chumbok.uaa.dto.response.LoggedInUserInfoResponse;
import com.chumbok.uaa.service.UserPreferenceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Logged in user info controller.
 */
@Slf4j
@RestController
public class LoggedInUserInfoController {

    private UserPreferenceService userPreferenceService;

    public LoggedInUserInfoController(UserPreferenceService userPreferenceService) {
        this.userPreferenceService = userPreferenceService;
    }

    @GetMapping(value = "/me")
    public LoggedInUserInfoResponse me() {
        return userPreferenceService.getLoggedInUserInfo();
    }
}

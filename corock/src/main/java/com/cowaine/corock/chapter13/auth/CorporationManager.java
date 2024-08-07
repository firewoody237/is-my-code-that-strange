package com.cowaine.corock.chapter13.auth;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CorporationManager {

    private final User user;

    public boolean verifyName() {
        return user.getName().length() >= 4;
    }

}

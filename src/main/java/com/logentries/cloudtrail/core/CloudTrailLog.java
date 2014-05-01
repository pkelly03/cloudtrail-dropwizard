package com.snapci.microblog.core;

import javax.validation.constraints.NotNull;

public class CloudTrailLog {

    @NotNull
    private final String content;

    public CloudTrailLog(Integer id, int userId, String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

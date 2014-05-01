package com.snapci.microblog;

import com.snapci.microblog.resources.CloudtrailResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class CloudTrailService extends Service<CloudTrailConfiguration> {
    public static void main(String... args) throws Exception {
        new CloudTrailService().run(args);
    }

    @Override
    public void initialize(Bootstrap bootstrap) {
        bootstrap.setName("cloudtrail");
    }


    @Override
    public void run(CloudTrailConfiguration config, Environment environment) throws Exception {
        environment.addResource(new CloudtrailResource());
    }
}

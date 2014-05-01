package com.snapci.cloudtrail.resources;

import com.snapci.microblog.core.CloudTrailLog;
import com.snapci.microblog.core.User;
import com.snapci.microblog.resources.CloudtrailResource;
import org.junit.Test;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MicroBlogResourceTest {
    private final CloudtrailResource microBlogResource = new CloudtrailResource();


//    @Test
    public void testIndexReturnsAllMicroBlogs() throws Exception {
//        when(userDAO.findByName("foo")).thenReturn(new User(1, "foo"));
//        List<CloudTrailLog> expected = Arrays.asList(new CloudTrailLog(1, "Hey There"), new CloudTrailLog(1, "Foo"));
//        when(microBlogDAO.findAllByUserId(1)).thenReturn(expected);
//        @SuppressWarnings("unchecked")
//        List<CloudTrailLog> actual = (List<CloudTrailLog>) microBlogResource.index("foo").getEntity();
//        assertThat(expected, equalTo(actual));
    }

    @Test
    public void testShowReturnsNotFoundIfBlogDoesNotExist() throws Exception {
    }


//    @Test
    public void testCreateReturnsNotFoundIfUserDoesNotExist() throws Exception {
        Response actual = microBlogResource.get();
        assertThat(actual.getStatus(), equalTo(Response.Status.NOT_FOUND.getStatusCode()));
    }

}

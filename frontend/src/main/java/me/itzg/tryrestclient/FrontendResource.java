package me.itzg.tryrestclient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/frontend")
@ApplicationScoped
public class FrontendResource {

    @Inject
    @RestClient
    BackendApi backendApi;

    @GET
    public ResponseDto testCallingBackend() {
        return backendApi.getValue();
    }
}

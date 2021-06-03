package me.itzg.tryrestclient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/backend")
@RegisterRestClient(configKey = "backend-api")
public interface BackendApi {

    @GET
    ResponseDto getValue();

}

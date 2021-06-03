package me.itzg.tryrestclient;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BackendResource implements BackendApi {

    @Override
    public ResponseDto getValue() {
        return
            new ResponseDto()
                .setValue("testing");
    }
}

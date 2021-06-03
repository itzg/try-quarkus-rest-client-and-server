This project tries out the [Quarkus Rest Client](https://quarkus.io/guides/rest-client) where the server-resource implements the client interface to ensure maintainability of the client->server.

In this contrived setup there are two application modules: `backend` and `frontend`. Both modules depend on the `api` module's declaration of the REST interface `BackendApi`.

`backend` implements a REST server-resource that `implements BackendApi` and binds to port 8081.

`frontend` injects the REST client, exposes its own server resource, and calls the backend via the injected REST client.

`frontend` binds to port 8080, so test out the end-to-end scenario by doing the following:
- start both applications
- invoke a `GET http://localhost:8080/frontend`
- ...and it should respond with `{"value":"testing"}`
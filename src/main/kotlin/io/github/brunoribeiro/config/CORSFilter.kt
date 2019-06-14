package io.github.brunoribeiro.config

import javax.ws.rs.container.ContainerRequestContext
import javax.ws.rs.container.ContainerResponseContext
import javax.ws.rs.container.ContainerResponseFilter

class CORSFilter: ContainerResponseFilter {

    override fun filter(requestContext: ContainerRequestContext, response: ContainerResponseContext) {
        response.headers
                .putSingle("Access-Control-Allow-Origin", "*")
        response.headers
                .putSingle("Access-Control-Allow-Methods", "OPTIONS, GET, POST, PUT, DELETE, HEAD")
        response.headers
                .putSingle("Access-Control-Allow-Credentials", "true")
        response.headers
                .putSingle("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With")
    }

}
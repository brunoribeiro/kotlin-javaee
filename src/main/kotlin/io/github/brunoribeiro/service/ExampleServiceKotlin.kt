package io.github.brunoribeiro.service

import org.eclipse.microprofile.config.inject.ConfigProperty
import java.net.InetAddress
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.core.Response

@Path("/exampleKT")
class ExampleServiceKotlin {


    fun get(): Response {
        return Response.ok("Hello World KT").build()
    }

    @Inject
    @ConfigProperty(name ="JAVA_HOME", defaultValue = "JAVA_HOME")
    lateinit var javaHome:String

    val ip = InetAddress.getLocalHost()

    @GET
    fun doHello() = "There is no place like $javaHome, running at $ip"

}
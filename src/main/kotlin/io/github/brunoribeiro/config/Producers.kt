package io.github.brunoribeiro.config

import javax.enterprise.inject.Produces
import javax.enterprise.inject.spi.InjectionPoint
import java.util.logging.Logger
import java.util.logging.Logger.getLogger

class Producers{

    @Produces
    fun loggerExposer(ip: InjectionPoint): Logger {
        return getLogger(ip.member
                .declaringClass
                .name)
    }
}
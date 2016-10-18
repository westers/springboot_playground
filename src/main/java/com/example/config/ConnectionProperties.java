package com.example.config;

import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix="connection")
@ToString
public class ConnectionProperties {
    /**
     * Username used during authentication
     */
    @Getter @Setter private String username;

    /**
     * Remote IP address of server
     */
    @Getter @Setter private String remoteAddress;

    /**
     * Remote IP port of server
     */
    @Getter @Setter private int remotePort;
}

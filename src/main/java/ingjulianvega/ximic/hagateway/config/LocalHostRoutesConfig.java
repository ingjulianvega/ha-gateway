package ingjulianvega.ximic.hagateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!local-discovery")
public class LocalHostRoutesConfig {
    @Bean
    public RouteLocator localhostRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("mssc-ha-person",
                        r -> r.path("/happy-animals/v1/person/**")
                                .uri("http://localhost:8080"))
                .route("mssc-ha-pet",
                        r -> r.path("/happy-animals/v1/pet/**")
                                .uri("http://localhost:8081"))
                .route("mssc-ha-owner",
                        r -> r.path("/happy-animals/v1/owner/**")
                                .uri("http://localhost:8082"))
                .build();
    }
}

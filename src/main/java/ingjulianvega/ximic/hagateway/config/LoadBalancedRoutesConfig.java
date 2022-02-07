package ingjulianvega.ximic.hagateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local-discovery")
@Configuration
public class LoadBalancedRoutesConfig {
    @Bean
    public RouteLocator loadBalancedRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("mssc-ha-person",
                        r -> r.path("/happy-animals/v1/person/**")
                                .uri("lb://HA-PERSON"))
                .route("mssc-ha-pet",
                        r -> r.path("/happy-animals/v1/pet/**")
                                .uri("lb://HA-PET"))
                .route("mssc-ha-owner",
                        r -> r.path("/happy-animals/v1/owner/**")
                                .uri("lb://HA-OWNER"))
                .build();
    }
}

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
                .route("mssc-asu-visit-bff",
                        r -> r.path("/asu/v1/visit-bff/**")
                                .uri("lb://MSSC-ASU-VISIT-BFF"))
                .route("mssc-asu-visit",
                        r -> r.path("/asu/v1/visit/**")
                                .uri("lb://MSSC-ASU-VISIT"))
                .route("mssc-asu-billing",
                        r -> r.path("/asu/v1/billing/**")
                                .uri("lb://MSSC-ASU-BILLING"))
                .route("mssc-asu-visit-type",
                        r -> r.path("/asu/v1/visit-type/**")
                                .uri("lb://MSSC-ASU-VISIT-TYPE"))
                .route("mssc-asu-patient",
                        r -> r.path("/asu/v1/patient/**")
                                .uri("lb://MSSC-ASU-PATIENT"))
                .route("mssc-asu-companion",
                        r -> r.path("/asu/v1/companion/**")
                                .uri("lb://MSSC-ASU-COMPANION"))
                .route("mssc-asu-recommendation",
                        r -> r.path("/asu/v1/recommendation/**")
                                .uri("lb://MSSC-ASU-RECOMMENDATION"))
                .route("mssc-asu-body-check",
                        r -> r.path("/asu/v1/body-check/**")
                                .uri("lb://MSSC-ASU-BODY-CHECK"))
                .route("mssc-asu-system-check",
                        r -> r.path("/asu/v1/system-check/**")
                                .uri("lb://MSSC-ASU-SYSTEM-CHECK"))
                .route("mssc-asu-treatment",
                        r -> r.path("/asu/v1/treatment/**")
                                .uri("lb://MSSC-ASU-TREATMENT"))
                .route("mssc-asu-disability",
                        r -> r.path("/asu/v1/disability/**")
                                .uri("lb://MSSC-ASU-DISABILITY"))
                .route("mssc-asu-remission",
                        r -> r.path("/asu/v1/remission/**")
                                .uri("lb://MSSC-ASU-REMISSION"))
                .route("mssc-asu-evidence",
                        r -> r.path("/asu/v1/evidence/**")
                                .uri("lb://MSSC-ASU-EVIDENCE"))
                .route("mssc-asu-concentration",
                        r -> r.path("/asu/v1/concentration/**")
                                .uri("lb://MSSC-ASU-CONCENTRATION"))
                .route("mssc-asu-remission-type",
                        r -> r.path("/asu/v1/remission-type/**")
                                .uri("lb://MSSC-ASU-REMISSION-TYPE"))
                .route("mssc-asu-disability-type",
                        r -> r.path("/asu/v1/disability-type/**")
                                .uri("lb://MSSC-ASU-DISABILITY-TYPE"))
                .route("mssc-asu-recommendation-type",
                        r -> r.path("/asu/v1/recommendation-type/**")
                                .uri("lb://MSSC-ASU-RECOMMENDATION-TYPE"))
                .route("mssc-asu-duration",
                        r -> r.path("/asu/v1/duration/**")
                                .uri("lb://MSSC-ASU-DURATION"))
                .route("mssc-asu-administration-method",
                        r -> r.path("/asu/v1/administration-method/**")
                                .uri("lb://MSSC-ASU-ADMINISTRATION-METHOD"))
                .route("mssc-asu-medicine",
                        r -> r.path("/asu/v1/medicine/**")
                                .uri("lb://MSSC-ASU-MEDICINE"))
                .route("mssc-asu-body-part",
                        r -> r.path("/asu/v1/body-part/**")
                                .uri("lb://MSSC-ASU-BODY-PART"))
                .route("mssc-asu-intensity",
                        r -> r.path("/asu/v1/intensity/**")
                                .uri("lb://MSSC-ASU-INTENSITY"))
                .route("mssc-asu-symptom",
                        r -> r.path("/asu/v1/symptom/**")
                                .uri("lb://MSSC-ASU-SYMPTOM"))
                .route("mssc-asu-system",
                        r -> r.path("/asu/v1/system/**")
                                .uri("lb://MSSC-ASU-SYSTEM"))
                .route("mssc-asu-evidence-type",
                        r -> r.path("/asu/v1/evidence-type/**")
                                .uri("lb://MSSC-ASU-EVIDENCE-TYPE"))
                .route("mssc-asu-disease",
                        r -> r.path("/asu/v1/disease/**")
                                .uri("lb://mssc-asu-DISEASE"))
                .route("mssc-asu-document-type",
                        r -> r.path("/asu/v1/document-type/**")
                                .uri("lb://MSSC-ASU-DOCUMENT-TYPE"))
                .route("mssc-asu-arl",
                        r -> r.path("/asu/v1/arl/**")
                                .uri("lb://MSSC-ASU-ARL"))
                .route("mssc-asu-eps",
                        r -> r.path("/asu/v1/eps/**")
                                .uri("lb://MSSC-ASU-EPS"))
                .route("mssc-asu-occupation",
                        r -> r.path("/asu/v1/occupation/**")
                                .uri("lb://MSSC-ASU-OCCUPATION"))
                .route("mssc-asu-gender",
                        r -> r.path("/asu/v1/gender/**")
                                .uri("lb://MSSC-ASU-GENDER"))
                .route("mssc-asu-marital-status",
                        r -> r.path("/asu/v1/marital-status/**")
                                .uri("lb://MSSC-ASU-MARITAL-STATUS"))
                .build();
    }
}

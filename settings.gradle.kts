rootProject.name = "flowershop-microservices"

include("product-catalog-service")
include("shoppingcart-service")
include("customers-service")
include("order-service")
include("api-gateway")
pluginManagement {
    plugins {
        id("org.springframework.boot") version "3.4.4"
        id("io.spring.dependency-management") version "1.1.7"
    }
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

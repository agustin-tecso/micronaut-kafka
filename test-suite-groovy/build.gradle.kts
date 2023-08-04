plugins {
    groovy
}

dependencies {
    testImplementation(platform(mn.micronaut.core.bom))
    testCompileOnly(mn.micronaut.inject.groovy)
    testImplementation(libs.testcontainers.kafka)
    testImplementation(mnTest.micronaut.test.spock)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testImplementation(libs.awaitility)
    testImplementation(projects.micronautKafka)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
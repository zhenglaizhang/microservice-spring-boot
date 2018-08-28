




## Run

```
./gradlew :bootRun
# mvn spring-boot:run
# Mapped "{[/hello/{firstName}/{lastName}],methods=[GET]}" onto public java.lang.String net.zhenglai.ms.Application.hello(java.lang.String,java.lang.String)
curl http://localhost:8080/hello/Zhenglai/Zhang
{"message": "Hello Zhenglai Zhang"}%  # json payload



▶ curl http://localhost:8080/v1/organizations/e254f8c-c442-4ebe-a82a-e2fc1d1ff78a/licenses/f3831f8c-c338-4ebe-a82a-e2fc1d1ff78a
{"id":"f3831f8c-c338-4ebe-a82a-e2fc1d1ff78a","organizationId":"test-org","productName":"demo-project-name","licenseType":"test-vol"}%


mvn clean package && java –jar target/licensing-service-0.0.1-SNAPSHOT.jar
```


## Tools

- https://www.getpostman.com/
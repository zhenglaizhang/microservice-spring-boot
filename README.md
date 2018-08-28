




## Run

```
./gradlew :bootRun
# mvn spring-boot:run
# Mapped "{[/hello/{firstName}/{lastName}],methods=[GET]}" onto public java.lang.String net.zhenglai.ms.Application.hello(java.lang.String,java.lang.String)
curl http://localhost:8080/hello/Zhenglai/Zhang
{"message": "Hello Zhenglai Zhang"}%  # json payload
```


## Tools

- https://www.getpostman.com/
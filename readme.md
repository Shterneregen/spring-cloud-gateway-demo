
### Build

```
gradlew clean build
```
### Deploy

```
docker-compose up -d --scale pc=2 --build
```

### Use
```
curl --request POST 
  --url http://localhost:8081/catalog 
  --header "Content-Type:application/json"
  --data "{\"name\":\"Internet\",\"price\":500}"
```

 ###### Some tips
 you must not use **spring-boot-admin-starter-client** and **spring-cloud-discovery** at the same time, just choose one of them!
 [issue](https://github.com/codecentric/spring-boot-admin/issues/409)
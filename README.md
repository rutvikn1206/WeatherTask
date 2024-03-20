# WeatherTask

Write a server by using SpringBoot Java and integrate Weather API from Rapid API. On the basis of that integration, expose your RESTful APIs as follows with JSON response.
Authentication Method: Header-based authentication with random client id and random client secret.
API 1: Get the Weather forecast summary of Any city using API
(/api/weather/summary)
Passing city as request param 
curl --location 'http://localhost:8080/api/weather/summary?city=Berlin' \
--header 'client-id: YOUR_CLIENT_ID' \
--header 'client-secret: CLIENT_SECRET'

API 2: Get hourly Weather forecast details of Any city using API
(/api/weather/hourly)
Passing city as request param 
curl --location 'http://localhost:8080/api/weather/hourly?city=Berlin' \
--header 'client-id: YOUR_CLIENT_ID' \
--header 'client-secret: CLIENT_SECRET'

API Document: https://rapidapi.com/wettercom-wettercom-default/api/forecast9

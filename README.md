# Throwback 

I would grade this project a 5.2, and here's why: I tried to set my focus on optimal code, since I work with REST API's at work I had it easier.
Since I fulfilled the "min" requirements, I tried to optimize my code with error messages and optimized the REST Request to its best and since its logging everything it makes it easier to track what's happening.
I also added a rating function, which enables a user to rate joke after its liking, but the joke is only able to have 1 rating at the time

# JokesDB

A minimal application to play with JPA and spring data topics.

## 🐳 Postgres with Docker

A simple solution expects a https://www.baeldung.com/linux/docker-run-without-sudo[running docker without sudo].
To get a Database connection (and associated JPA-autocomplete), run `./gradlew bootRun` (it will hang).

Alternatively launch a postgres docker container similar to the `dockerPostgres`-Task in `build.gradle` by hand.

## 🪣 IntelliJ Database View

View | Tool Windows | Database | + | Data Source from URL
```
jdbc:postgresql://localhost:5432/localdb
User: localuser, Password: localpass
```

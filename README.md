# Microservices Version of Quotegram
Here I will document the learnings of building Microservices based application. I am here trying to convert the monolith application <b><a href="https://github.com/Sowmiya-yes/Quotegram"> Quotegram <a> </b> which I built from scratch to a microservices based application.

### Day 01
<li>Gone through the official documentation https://spring.io/microservices for Spring Boot and Spring cloud<li>
Followed https://www.youtube.com/playlist?list=PLqq-6Pq4lTTZSKAFG6aCDVDP86Qx4lNas to build 3 microservices for Quotegram<br>
    <br>
    1. Post Details Service which returns the Post related details given a <b>Post ID</b> like below 
    <pre>
    {
        "postId": "123",
        "postUrl": "https://amazon.s3.com/sadqwsq",
        "postCaption": "My first post"
    }
    </pre>
    2. Likes Info Service which returns List of Post IDs with likes count given <b>User ID</b>
    <pre>
    {
        "listOfPostIdWithLikes": [
            {
                "postId": "123",
                "userId": "101",
                "likes": 10
            },
            {
                "postId": "789",
                "userId": "101",
                "likes": 8
            }
        ],
        "userID": "101"
    }
    </pre>
    3. User Posts Services which returns the following information<br>
    <Pre>
        {
            "userId": "101",
            "posts": [
                {
                    "post": {
                        "postId": "123",
                        "postUrl": "https://amazon.s3.com/sadqwsq",
                        "postCaption": "My first post"
                    },
                    "likes": 10
                },
                {
                    "post": {
                        "postId": "789",
                        "postUrl": "https://amazon.s3.com/dedww",
                        "postCaption": "My third post"
                    },
                    "likes": 8
                }
            ]
        }
    </Pre>
    
### Day 02
1. Added service discovery using Eureka (Netflix OSS) to the services I developed on day 01
2. Learn't how Hystrix as a Circuit Breaker Proxy can help application to be fault tolerance and resilient from `https://www.youtube.com/playlist?list=PLqq-6Pq4lTTbXZY_elyGv7IkKrfkSrX5e`

 
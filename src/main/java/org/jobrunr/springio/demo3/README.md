## Demo 3

### Exceptions happen, let JobRunr handle them

1. Adapt Demo3API so an exceptions happen while fishing - JobRunr will automatically retry!
2. By default JobRunr will only retry 10 times - what if you want to only retry 3 times?
3. Even if there is an exception and the job is retried, I only want to add bait once to my hook. How can you change
   it to a durable execution and make it reentrant and/or idempotent? 
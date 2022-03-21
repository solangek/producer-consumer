# producer consumer

The basic producer consumer pattern is a pattern that allows a producer to produce a stream of data, and a consumer to consume that data.
In Java we can control concurrency and race conditions with 
wait/notify. This allows the consumer to wait for the data to be produced
by the producer before consuming, and vice versa. 

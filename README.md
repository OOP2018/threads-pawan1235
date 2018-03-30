## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |1,000,00,000        |0.0839856        |
| Using ReentrantLock     |1,000,00,000        |9.5354053        |
| Syncronized method      |                    |8.9087386        |
| AtomicLong for total    |                    |                 |

## 1. Using unsynchronized counter object


1.1 Ans: The total should be zero but after the several run the total is not zero and it never the same.

1.3 Ans: Becasue The 2 threads share the same counter and those 2 threads are running at the same time so if 1 of them finished it will return it's counter value. This is why the total is not zero and not the same at each time.

## 2. Implications for Multi-threaded Applications

This can affect when the customer withdraw and receive money transaction at the same time the account could have 0 in his account if the thread of withdraw finish after the thread of transaction.   

## 3. Counter with ReentrantLock

3.1 Now the total is always be zero.

3.2 Because we lock the Counter for 1 operation only and when it's done it will unlock and do the next operation now the operation is in order so it's always return 0.

3.3 It will lock the operation of the thread. Because when we have a multithread that access the same resource we want to make the multithread access a resouce one at a time.

3.4 When the operation done the counter is still lock we have to unlock it so the next operation can access counter.

## 4. Counter with synchronized method

answer question 4

## 5. Counter with AtomicLong

answer question 5

## 6. Analysis of Results

answer question 6

## 7. Using Many Threads (optional)


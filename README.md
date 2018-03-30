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
| Unsynchronized counter  |100,000,000         |0.0839856        |
| Using ReentrantLock     |100,000,000         |9.5354053        |
| Syncronized method      |100,000,000         |8.9087386        |
| AtomicLong for total    |100,000,000         |3.5565696        |


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

4.1 Yes, The total is 0

4.2 Because when the multithread are trying to access add method on the same object the synchronized will allow the multithread only one thread will be able to execute it at a time.

4.3 Synchronize mean only one thread at a time should be able to access synchronized method. when we have the same method that access the same object so that we can avoid racing condition.  

## 5. Counter with AtomicLong

5.1 Because AtomicLong is already a thread safe for long so we don't have to do anything with it since it is already lock.

5.2 when we are having only numeric attribute and multithread is involved because Atomiclong is guarantee that the thread is getting the right value.

## 6. Analysis of Results

6.1 The fastest is AtomicCounter and the slowest is CounterWithLock

6.2 Synchronize ,Because for atomiclong it only for a long attribute if we want to do something else more than numeric it will not support. And for Lock we have to carefully lock and unlock if the program is more complicate it will be harder for Lock.

## 7. Using Many Threads (optional)


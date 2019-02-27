## This is a repository for algorithms that I practice to stay in touch with them and the Java language.

### As of now, I've added implementation of the following algorithms:

1. Breadth First Search
2. Depth First Search
3. LRU Cache Mechanism
4. Least Used Cache Removal Mechanism
5. Decide if the cell will be alive or dead depending on the state of its neighbors. The catch here was that my initial logic was fine but on line 57 where I'm copying the array "nextDay" into "cells", I was copying the reference of nextDay array by doing "cells = nextDay" and the problem with this is that on the subsequent iterations for any number of days more than one, making changes to the nextDay array would also change the values in cells array as both pointed to the same memory location now.
6. Incrementing the given array of integers by 1.

// Last updated: 4/3/2026, 8:31:08 PM
1class MyCircularQueue {
2    int[] arr;
3    int first,last,size,current;
4    public MyCircularQueue(int k) {
5        size=k;
6        arr=new int[k];
7        first=0;
8        last=-1;
9        current=0;
10    }
11    public boolean enQueue(int value) {
12        if(isFull())return false;
13        last=(last+1)%size;
14        arr[last]=value;
15        current++;
16        return true;
17    }
18    public boolean deQueue() {
19        if(isEmpty()) return false;
20        first=(first+1)%size;
21        current--;
22        return true;
23    }
24    public int Front() {
25        if(isEmpty())return -1;
26        return arr[first]; 
27    }
28    public int Rear() {
29        if(isEmpty())return -1;
30        return arr[last];
31    }
32    public boolean isEmpty() {
33        return current==0;
34    }
35    public boolean isFull() {
36        return current==size;
37    }
38}
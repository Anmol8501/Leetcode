// Last updated: 4/28/2026, 8:02:24 PM
class MyCircularQueue {
    int[] arr;
    int first,last,size,current;
    public MyCircularQueue(int k) {
        size=k;
        arr=new int[k];
        first=0;
        last=-1;
        current=0;
    }
    public boolean enQueue(int value) {
        if(isFull())return false;
        last=(last+1)%size;
        arr[last]=value;
        current++;
        return true;
    }
    public boolean deQueue() {
        if(isEmpty()) return false;
        first=(first+1)%size;
        current--;
        return true;
    }
    public int Front() {
        if(isEmpty())return -1;
        return arr[first]; 
    }
    public int Rear() {
        if(isEmpty())return -1;
        return arr[last];
    }
    public boolean isEmpty() {
        return current==0;
    }
    public boolean isFull() {
        return current==size;
    }
}
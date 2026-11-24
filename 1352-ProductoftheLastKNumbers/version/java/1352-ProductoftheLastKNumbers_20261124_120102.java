// Last updated: 11/24/2026, 12:01:02 PM
1class ProductOfNumbers {
2    List<Integer> list;
3    public ProductOfNumbers() {
4        list = new ArrayList<>();
5        list.add(1);
6    }
7    public void add(int num) {
8
9        if(num == 0){
10            list.clear();
11            list.add(1);
12        }
13        else{
14            int last = list.get(list.size()-1);
15            list.add(last * num);
16        }
17    }
18    public int getProduct(int k) {
19        int size = list.size();
20        if(k >= size) return 0;
21        return list.get(size-1) / list.get(size-1-k);
22    }
23}
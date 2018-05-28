boolean sumOfTwo(int[] a, int[] b, int v) {
    HashSet<Integer> dif = new HashSet<Integer>();
    
    for(int i = 0; i < a.length; i++)
        dif.add(a[i]);
    
    for(int i = 0; i < b.length; i++)
        if(dif.contains(v - b[i]))
            return true;
    
    return false;
}
